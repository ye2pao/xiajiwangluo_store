package com.xiajiwangluo.controller;


import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.Total;
import com.xiajiwangluo.service.ExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/export")
public class ExportController {

    @Autowired
    private ExportService exportService;

    //导出统计
    @RequestMapping("/total")
    public boolean ExportTotal(@RequestBody List<Total> totalList){

        return exportService.ExportTotal(totalList);

    }
    //导出统计
    @RequestMapping("/drawback")
    public boolean ExportDrawback(@RequestBody List<Inout> inoutList){

        return exportService.ExportDrawback(inoutList);

    }
}
