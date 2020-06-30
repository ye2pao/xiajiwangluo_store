package com.xiajiwangluo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiajiwangluo.bean.*;
import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;
import com.xiajiwangluo.dao.DepotMapper;
import com.xiajiwangluo.service.DepotService;
import com.xiajiwangluo.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
@Transactional
public class DepotServiceImpl implements DepotService{

    @Autowired
    private DepotMapper depotMapper;

    /***
     * 分页
     * @param pageNum 当前页面
     * @param pageSize 记录数
     * @return
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize , DA_list da_list) {

        PageHelper.startPage(pageNum,pageSize);//分页

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");

        DepotExample example = new DepotExample();
        DepotExample.Criteria criteria = example.createCriteria();
        criteria.andSidEqualTo(sid);

        if(da_list.type!=null){
            boolean numeric = MathUtils.isNumeric(da_list.type);
            if(numeric){
                criteria.andUrlLike("%"+da_list.type+"%");
            }else {
                criteria.andTitleLike("%"+da_list.type+"%");
            }

        }

        Page<Depot> page= (Page<Depot>) depotMapper.selectByExample(example);

        return new PageResult(page.getTotal(),page.getResult());
    }
}
