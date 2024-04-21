package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public ModelAndView home(ModelAndView mav) {
		mav.setViewName("home");
		mav.addObject("msg", "안녕하세요");
		return mav;
	}
	
	@RequestMapping(value="/checkName", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView checkName(@RequestParam("name") String name, ModelAndView mav) {
		
		mav.setViewName("home");
		mav.addObject("msg", "안녕하세요");
		mav.addObject("name", name);
		mav.addObject("result", "Hello," + name + "!!");
		
		return mav;
	}
}
