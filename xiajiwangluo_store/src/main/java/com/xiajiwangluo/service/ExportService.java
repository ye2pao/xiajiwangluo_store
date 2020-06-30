package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.Total;

import java.util.List;

public interface ExportService {

    boolean ExportTotal(List<Total> totalList);

    boolean ExportDrawback(List<Inout> inoutList);
}
