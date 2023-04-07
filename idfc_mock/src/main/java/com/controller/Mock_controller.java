package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Mock_dao;
import com.dto.Mock_dto;

@Controller
public class Mock_controller {
	@Autowired
	Mock_dto mock_dto;
	@Autowired 
	Mock_dao mock_dao;
	
	@RequestMapping("/insert")
	public ModelAndView insert(){
		ModelAndView view=new ModelAndView("insert.jsp");
		view.addObject("key", mock_dto);
		return view;
	}
	@RequestMapping("/save")
	@ResponseBody
	public String savedata(Mock_dto dto){
		mock_dao.inserting(dto);
		return "data saved successfully";
	}
	
	@RequestMapping("/fetch")
	public ModelAndView fetch(){
		ModelAndView view=new ModelAndView("fetch.jsp");
		view.addObject("key1", mock_dto);
		return view;
	}
	@RequestMapping("/fetchdata")
	@ResponseBody
	public ModelAndView fetching (Mock_dto dto){
		Mock_dto dto2=mock_dao.fetchdetails(dto.getId());
		ModelAndView view=new ModelAndView("details.jsp");
		view.addObject("key2", dto2);
		return view;
	}

}
