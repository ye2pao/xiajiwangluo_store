package com.xiajiwangluo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.DepotExample;
import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.InoutExample;
import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.bean.entity.PageResult;
import com.xiajiwangluo.dao.InoutMapper;
import com.xiajiwangluo.service.InoutService;
import com.xiajiwangluo.util.DateUtils;
import com.xiajiwangluo.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class InoutServiceImpl implements InoutService {


    @Autowired
    private InoutMapper inoutMapper;

    @Override
    public List<Inout> findAll(String sid,Integer cls) {
        InoutExample example = new InoutExample();
        InoutExample.Criteria criteria = example.createCriteria();
        criteria.andClsEqualTo(cls);
        criteria.andSidEqualTo(sid);

        List<Inout> inoutList = inoutMapper.selectByExample(example);
        return inoutList;
    }

    /***
     * 分页
     * @param pageNum 当前页面
     * @param pageSize 记录数
     * @return
     */
    @Override
    public PageResult findPage(int pageNum, int pageSize, DA_list da_list) {

        PageHelper.startPage(pageNum,pageSize);//分页

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");

        InoutExample example = new InoutExample();
        InoutExample.Criteria criteria = example.createCriteria();

        criteria.andSidEqualTo(sid);
        criteria.andClsEqualTo(da_list.cls);

        //条件查询：日期
        if(da_list.data!=null&&"".equals(da_list.data)){
            Date pastDate = null;
            try {
                pastDate = DateUtils.string2Date(da_list.data,"yyyy-MM-dd");
            } catch (ParseException e) {
                e.printStackTrace();
            }
            criteria.andDaysGreaterThanOrEqualTo(pastDate);
        }

        //条件查询：商品名称
        if(da_list.type!=null&&"".equals(da_list.type)){
            boolean numeric = MathUtils.isNumeric(da_list.type);
            if(numeric){
                criteria.andUrlLike("%"+da_list.type+"%");
            }else {
                criteria.andTitleLike("%"+da_list.type+"%");
            }

        }

        Page<Inout> page= (Page<Inout>) inoutMapper.selectByExample(example);

        return new PageResult(page.getTotal(),page.getResult());
    }
}
