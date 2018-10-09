package com.training.firstweb;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("session") //global session also known as application
public class ScopeDemoController {
	
  private int counter;
  
  @RequestMapping(value="/scopedemo",method=RequestMethod.GET)
  public ModelAndView defaultAction()
  {
	  counter++;
	  return new ModelAndView("sdpage","count",counter);
  }
}
