package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@GetMapping("/home")
	public String homePage()
	{
		return "home.jsp";
	}
	
	@GetMapping("/student")
	public String studentDetails(Model model)
	{	
		model.addAttribute("sid", 10);
		model.addAttribute("sname", "John");
		
		return "student.jsp";
	}
	
	@GetMapping("/employee")
	public String employeeDetails(ModelMap map)
	{
		map.addAttribute("name", "Smith");
		map.addAttribute("role", "Developer");
		map.addAttribute("salary", 60000.0);
		map.put("company", "IBM");
		return "employee.jsp";
	}
	
	@GetMapping("/product")
	public ModelAndView productDetails(ModelAndView model)
	{
		model.addObject("pname", "Laptop");
		model.addObject("price", 40000.0);
		model.setViewName("product.jsp");
		
		return model;
	}
	
	@GetMapping("/form")
	public String getFormDetails()
	{
		return "form.jsp";
	}
	
//	@PostMapping("/save")
//	public ModelAndView studentRegistration(HttpServletRequest req, ModelAndView view)
//	{
//		String sname=req.getParameter("name");
//		String sage=req.getParameter("age");
//		String sgender=req.getParameter("gender");
//		String semail=req.getParameter("email");
//		
//		view.addObject("name", sname);
//		view.addObject("age", sage);
//		view.addObject("gender", sgender);
//		view.addObject("email", semail);
//		
//		view.setViewName("display.jsp");
//		
//		return view;
//		
//	}
	
	@PostMapping("/save")
	public ModelAndView studentRegistration(@ModelAttribute Student s, ModelAndView view)
	{
		view.addObject("Student", s);
		view.setViewName("display.jsp");
		
		return view;
	}
}
