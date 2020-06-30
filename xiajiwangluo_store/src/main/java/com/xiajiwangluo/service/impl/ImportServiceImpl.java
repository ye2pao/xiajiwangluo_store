package com.xiajiwangluo.service.impl;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Supplier;
import com.xiajiwangluo.bean.entity.Result;
import com.xiajiwangluo.dao.DepotMapper;
import com.xiajiwangluo.dao.SupplierMapper;
import com.xiajiwangluo.service.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@Transactional
public class ImportServiceImpl implements ImportService {

    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private DepotMapper depotMapper;

    @Override
    public Result ImportSupplier(List<Supplier> supplierList) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");
        for (Supplier supplier : supplierList) {
            supplier.setSid(sid);
            try {
                supplierMapper.insert(supplier);
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false, "信息异常,上传失败");
            }
        }

        return new Result(true, "上传成功");
    }

    @Override
    public Result ImportDepot(List<Depot> depotList) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");

        for (Depot depot : depotList) {
            depot.setSid(sid);
            try {
                depotMapper.insert(depot);
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false, "信息异常,上传失败");
            }
        }
        return new Result(true, "上传成功");
    }
}
