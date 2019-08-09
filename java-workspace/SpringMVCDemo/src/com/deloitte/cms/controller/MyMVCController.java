package com.deloitte.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyMVCController {
@RequestMapping("/hello")
public String kkr()
{
return"rama";
}
@RequestMapping("/addcustomers")
public String addcustomer()
{
	
return "addcustomer";

}
@RequestMapping("/updatecustomers")
public String updatecustomer()
{
	
return "updatecustomer";

}
@RequestMapping("/deletecustomers")
public String deletecustomer()
{
	
return "deletecustomer";

}
@RequestMapping("/findByIdcustomers")
public String findcustomer()
{
	
return "findCustomerById";

}
@RequestMapping("/findAllcustomers")
public String allcustomer()
{
	
return "findAllCustomer";

}

@RequestMapping("/leave")
public ModelAndView ssds()
{
	
ModelAndView view = new ModelAndView();
view.addObject("Message","We'll leave in 5 min.");
view.setViewName("lol");
return view;
}
	
}
