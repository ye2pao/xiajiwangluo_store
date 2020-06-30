package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.DepotExample;
import com.xiajiwangluo.bean.Detail;
import com.xiajiwangluo.bean.DetailExample;
import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.dao.DepotMapper;
import com.xiajiwangluo.dao.DetailMapper;
import com.xiajiwangluo.service.AnalysisService;


import com.xiajiwangluo.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class AnalysisServiceImpl implements AnalysisService {

	@Autowired
	private DepotMapper depotMapper;

	@Autowired
	private DetailMapper detailMapper;

	@Override
	public List<Detail> hongbang(DA_list da_list,String sid) {//数据分析


		//获取前端传送数据
		String date = da_list.getData();
		String type = da_list.getType();
		List<Detail> detailList =null;

		if("num".equals(type)){
			//查询指定天数内的销售数量
			detailList = detailMapper.selectNum1(sid,date);
		}else if("price".equals(type)){
			//查询指定天数内销售金额
			detailList = detailMapper.selectPrice1(sid,date);
		}else if("profit".equals(type)){
			//查询指定天数内销售利润
			detailList = detailMapper.selectProfit1(sid,date);
		}

		return detailList;
	}

	@Override
	public List<Detail> heibang(DA_list da_list,String sid) {

		//获取前端传送数据

		String data = da_list.getData();//日期
		String type = da_list.getType();//类型

		List<Detail> detailList =null;

		if("num".equals(type)){
			//查询指定天数内的销售数量
			detailList = detailMapper.selectNum(sid,data);
		}else if("price".equals(type)){
			//查询指定天数内销售金额
			detailList = detailMapper.selectPrice(sid,data);
		}else if("profit".equals(type)){
			//查询指定天数内销售利润
			detailList = detailMapper.selectProfit(sid,data);
		}

		return detailList;

	}

	@Override
	public List<Depot> zhixiao(String sid,Integer data) {

		//查询商户销售产品
		DetailExample detailExample = new DetailExample();
		detailExample.createCriteria().andSidEqualTo(sid);
		List<Detail> detailList = detailMapper.selectByExample(detailExample);
		List list = new ArrayList();
		for (Detail detail : detailList) {
			list.add(detail.getUrl());
		}
		//查询商户库存中未销售的商品
		DepotExample depotExample = new DepotExample();
		DepotExample.Criteria criteria = depotExample.createCriteria();
		depotExample.setDistinct(true);
		criteria.andSidEqualTo(sid);
		criteria.andUrlNotIn(list);
		if(data!=null){
			try {
				criteria.andRukuGreaterThanOrEqualTo(DateUtils.getPastDate(data));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		List<Depot> depotList = depotMapper.selectZhixiao(depotExample);

		return depotList;
	}

}
