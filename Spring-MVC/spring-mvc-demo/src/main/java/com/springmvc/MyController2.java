package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController2 {
	
	    @GetMapping("/form1")
		public String getForm()
		{
			return "form1.jsp";
		}
	    
	    @PostMapping("/save1")
	    public ModelAndView saveCredentials(HttpServletRequest req,ModelAndView view)
	    {
	    	String sid=req.getParameter("id");
	    	String spass=req.getParameter("password");
	    	
	    	if("101".equals(sid) && "admin".equals(spass))
	    	{
	    		view.addObject("id",sid );
	    		view.setViewName("leaveApp.jsp");
	    		return view;
	    	}
	    	else
	    	{
	    		view.setViewName("form1.jsp");
	    		return view;
	    	}
	    }
	    
	    @PostMapping("/leaveapp")
	    public ModelAndView saveLeaveApp(@ModelAttribute Employee e, ModelAndView view)
	    {
	    	view.addObject("Employee", e);
	    	view.setViewName("display1.jsp");
	    	
	    	return view;
	    }
	

}
