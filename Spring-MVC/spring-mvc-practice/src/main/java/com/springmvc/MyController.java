package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/add") 
	public void add()
	{
		 
		System.out.println("im here");
	}
	
	@GetMapping("/form")
	public String fillForm()
	{
		return "form.jsp";
	}
	@PostMapping("/save")
	public ModelAndView getEmployeeDetails(HttpServletRequest req, ModelAndView view)
	{
		String ename=req.getParameter("name");
		String eage=req.getParameter("age");
		String ephone=req.getParameter("phone");
		String eaddress=req.getParameter("address");
		
		view.addObject("name", ename);
		view.addObject("age", eage);
		view.addObject("phone", ephone);
		view.addObject("address", eaddress);
		view.setViewName("display.jsp");
		
		return view;

		
	}
	

}
