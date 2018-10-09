package com.training.firstweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@RequestMapping(value="/someadmintask",method=RequestMethod.GET)
	public String adminTask()
	{
		return "adminshow";
	}
	
	@RequestMapping(value= {"/someadminreport","/report"})
	public String adminReport()
	{
		return "adminreport";
	}
	
	@RequestMapping(value="/someadmintask",method=RequestMethod.POST)
	public String adminTaskPost()
	{
		return "adminreport"; //post can be used while working with forms
	}

}
