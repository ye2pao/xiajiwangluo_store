package com.xiajiwangluo.dao;

import com.xiajiwangluo.bean.Detail;
import com.xiajiwangluo.bean.DetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExample(DetailExample example);

    List<Detail> selectByDistincts(DetailExample example);

    Detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByPrimaryKeySelective(Detail record);

    int updateByPrimaryKey(Detail record);

    //黑榜

    //销售数量查询
    List<Detail> selectNum(@Param("sid") String sid,@Param("data") String date);
    //销售金额查询
    List<Detail> selectPrice(@Param("sid") String sid,@Param("data") String date);
    //销售利润查询
    List<Detail> selectProfit(@Param("sid") String sid,@Param("data") String date);

    //红榜

    //销售数量查询
    List<Detail> selectNum1(@Param("sid") String sid,@Param("data") String date);
    //销售金额查询
    List<Detail> selectPrice1(@Param("sid") String sid,@Param("data") String date);
    //销售利润查询
    List<Detail> selectProfit1(@Param("sid") String sid,@Param("data") String date);
}