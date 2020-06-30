package com.xiajiwangluo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiajiwangluo.bean.Total;
import com.xiajiwangluo.bean.TotalExample;
import com.xiajiwangluo.bean.TotalKey;

public interface TotalMapper {
    int countByExample(TotalExample example);

    int deleteByExample(TotalExample example);

    int deleteByPrimaryKey(TotalKey key);

    int insert(Total record);

    int insertSelective(Total record);

    List<Total> selectByExample(TotalExample example);

    Total selectByPrimaryKey(TotalKey key);

    int updateByExampleSelective(@Param("record") Total record, @Param("example") TotalExample example);

    int updateByExample(@Param("record") Total record, @Param("example") TotalExample example);

    int updateByPrimaryKeySelective(Total record);

    int updateByPrimaryKey(Total record);

}