package com.xiajiwangluo.dao;

import com.xiajiwangluo.bean.Wenda;
import com.xiajiwangluo.bean.WendaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WendaMapper {
    int countByExample(WendaExample example);

    int deleteByExample(WendaExample example);

    int insert(Wenda record);

    int insertSelective(Wenda record);

    List<Wenda> selectByExample(WendaExample example);

    int updateByExampleSelective(@Param("record") Wenda record, @Param("example") WendaExample example);

    int updateByExample(@Param("record") Wenda record, @Param("example") WendaExample example);

}