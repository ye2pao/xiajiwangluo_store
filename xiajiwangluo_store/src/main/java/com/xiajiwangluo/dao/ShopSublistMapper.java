package com.xiajiwangluo.dao;

import com.xiajiwangluo.bean.ShopSublist;
import com.xiajiwangluo.bean.ShopSublistExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopSublistMapper {
    int countByExample(ShopSublistExample example);

    int deleteByExample(ShopSublistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopSublist record);

    int insertSelective(ShopSublist record);

    List<ShopSublist> selectByExample(ShopSublistExample example);

    ShopSublist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopSublist record, @Param("example") ShopSublistExample example);

    int updateByExample(@Param("record") ShopSublist record, @Param("example") ShopSublistExample example);

    int updateByPrimaryKeySelective(ShopSublist record);

    int updateByPrimaryKey(ShopSublist record);
}