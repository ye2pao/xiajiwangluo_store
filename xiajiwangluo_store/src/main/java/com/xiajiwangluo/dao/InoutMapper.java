package com.xiajiwangluo.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.InoutExample;

public interface InoutMapper {
    int countByExample(InoutExample example);

    int deleteByExample(InoutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Inout record);

    int insertSelective(Inout record);

    List<Inout> selectByExample(InoutExample example);

    Inout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Inout record, @Param("example") InoutExample example);

    int updateByExample(@Param("record") Inout record, @Param("example") InoutExample example);

    int updateByPrimaryKeySelective(Inout record);

    int updateByPrimaryKey(Inout record);

    List<Inout> selectSum(InoutExample example);

    List<Inout> tuikuanTotal(InoutExample example);
}