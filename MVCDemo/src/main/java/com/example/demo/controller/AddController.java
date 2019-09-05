/**
 * 
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kailash
 *
 */
@Controller
public class AddController {

	@RequestMapping("show")
	public ModelAndView formDetails() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form.jsp");
		return mv;
	}

	@RequestMapping("add")
	public ModelAndView addNumbers(@RequestParam("input1") int i,@RequestParam("input2") int j) {
		ModelAndView mv = new ModelAndView();
		int k=i+j;
		mv.addObject("result", k);
		mv.setViewName("result.jsp");
		
		return mv;
	}
}
