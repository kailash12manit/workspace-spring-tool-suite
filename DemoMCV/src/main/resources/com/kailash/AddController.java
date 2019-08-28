package com.kailash;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public void addNumbers(HttpServletRequest request, HttpServletResponse response) {
		
//		ModelAndView mav = new ModelAndView("display.jsp");
//		mav.addObject("result",10);
//		return mav;
		System.out.println("i am kkkk");
	}
}
