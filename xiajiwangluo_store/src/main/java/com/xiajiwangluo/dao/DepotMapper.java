package com.xiajiwangluo.dao;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.DepotExample;
import com.xiajiwangluo.bean.DepotKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepotMapper {
	int countByExample(DepotExample example);

	int deleteByExample(DepotExample example);

	int deleteByPrimaryKey(DepotKey key);

	int insert(Depot record);

	int insertSelective(Depot record);

	List<Depot> selectByExample(DepotExample example);

	Depot selectByPrimaryKey(DepotKey key);

	int updateByExampleSelective(@Param("record") Depot record, @Param("example") DepotExample example);

	int updateByExample(@Param("record") Depot record, @Param("example") DepotExample example);

	int updateByPrimaryKeySelective(Depot record);

	int updateByPrimaryKey(Depot record);

	List<Depot> selectZhixiao(DepotExample example);

}