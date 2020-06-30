package com.xiajiwangluo.controller;


import com.xiajiwangluo.bean.Inout;
import com.xiajiwangluo.bean.Total;

import com.xiajiwangluo.service.TotalService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/total")
public class TotalController {
	
	@Autowired
	private TotalService totalService;

	/**
	 * 查询销售统计
	 * */
	@RequestMapping("/findAll")
	public List<Total> findAll(String day){
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String sid = (String) session.getAttribute("sid");

		System.out.println("total");
		List<Total> totalList = totalService.findAll(sid, day);

		return totalList;
	}

	/**
	 * 查询退货统计
	 * */
	@RequestMapping("/drawback")
	public List<Inout> findDrawback(String day) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		String sid = (String) session.getAttribute("sid");

		List<Inout> inoutList = totalService.findDrawback(sid, day);
		return inoutList;
	}

}
