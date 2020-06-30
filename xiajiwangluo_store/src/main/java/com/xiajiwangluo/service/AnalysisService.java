package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Detail;
import com.xiajiwangluo.bean.beangroup.DA_list;

import java.util.List;

public interface AnalysisService {

	List<Detail> hongbang(DA_list da_list,String sid);

	List<Detail> heibang(DA_list da_list,String sid);
	
	List<Depot> zhixiao(String sid,Integer data);
	
}
