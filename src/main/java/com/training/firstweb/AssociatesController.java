package com.training.firstweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/associate")
public class AssociatesController {
	
	@RequestMapping(value="/tasklist.html")
	public String getList()
	{
		System.out.println("dumyyyyyyyy lineeee");
		return "tasklist";
	}
	
	@RequestMapping()
	public String home()
	{
		return "assochome";
	}
	
	@RequestMapping("*")
	public String any()
	{
		return "any";
	}

}
