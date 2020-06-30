package com.xiajiwangluo.controller;


import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Supplier;
import com.xiajiwangluo.bean.entity.Result;
import com.xiajiwangluo.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/import")
public class ImportController {

    @Autowired
    private ImportService importService;

    @RequestMapping("/supplier")
    public Result ImportSupplier(@RequestBody List<Supplier> supplierList){
        System.err.println(supplierList);

        return importService.ImportSupplier(supplierList);
    }

    @RequestMapping("/depot")
    public Result ImportDepot(@RequestBody List<Depot> depotList){
        System.err.println(depotList);

        return importService.ImportDepot(depotList);
    }
}
