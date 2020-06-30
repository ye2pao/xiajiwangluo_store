package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.InoutExample;
import com.xiajiwangluo.bean.Total;
import com.xiajiwangluo.bean.TotalExample;
import com.xiajiwangluo.dao.InoutMapper;
import com.xiajiwangluo.dao.TotalMapper;
import com.xiajiwangluo.service.TotalService;
import com.xiajiwangluo.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class TotalServiceImpl implements TotalService {

    @Autowired
    private TotalMapper totalMapper;

    @Autowired
    private InoutMapper inoutMapper;

    /**
     * 查询销售统计
     * */
    @Override
    public List<Total> findAll(String sid,String day) {
        TotalExample example = new TotalExample();
        TotalExample.Criteria criteria = example.createCriteria();

        criteria.andSidEqualTo(sid);
        if(day!=null&&!"".equals(day)){
            try {
                Date pastDate = DateUtils.string2Date(day,"yyyy-MM-dd");
                criteria.andDaysGreaterThanOrEqualTo(pastDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        List<Total> totalList= totalMapper.selectByExample(example);

        return totalList;
    }

    /**
     * 查询退货统计
     * */
    @Override
    public List<Inout> findDrawback(String sid,String day) {

        InoutExample example = new InoutExample();
        InoutExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);
        criteria.andClsEqualTo(0);
        try {
            criteria.andDaysGreaterThanOrEqualTo(DateUtils.string2Date(day,"yyyy-MM-dd"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        List<Inout> inoutList = inoutMapper.selectByExample(example);

        return inoutList;
    }

}
