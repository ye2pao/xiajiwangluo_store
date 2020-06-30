package com.xiajiwangluo.service;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Supplier;
import com.xiajiwangluo.bean.entity.Result;

import java.util.List;

public interface ImportService {

    Result ImportSupplier(List<Supplier> supplierList);

    Result ImportDepot(List<Depot> depotList);
}
