package com.xiajiwangluo.controller;

import com.xiajiwangluo.bean.Depot;
import com.xiajiwangluo.bean.Detail;
import com.xiajiwangluo.bean.beangroup.DA_list;
import com.xiajiwangluo.service.AnalysisService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 红榜榜单
 * 黑榜榜单
 * 滞销榜单
 */
@RestController
@RequestMapping("/analysis")
public class AnalysisController {
	
	@Autowired
	private AnalysisService service;

	/**
	 * 红榜榜单
	 * */
	@RequestMapping("/best")
	public List<Detail> hongbang(@RequestBody DA_list da_list){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        String sid = (String) session.getAttribute("sid");
        if(sid==null){
            return null;
        }
        return service.hongbang(da_list,sid);
	}
	/**
	 * 黑榜榜单
	 * */
	@RequestMapping("/worst")
	public List<Detail> heibang(@RequestBody DA_list da_list) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String sid = (String) session.getAttribute("sid");

		if(sid==null){
			return null;
		}
		return service.heibang(da_list,sid);
	}
	/**
	 * 滞销榜单
	 * */
	@RequestMapping("/unsalable")
	public List<Depot> zhixiao(Integer data) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String sid = (String) session.getAttribute("sid");

		return service.zhixiao(sid,data);
	}
}
