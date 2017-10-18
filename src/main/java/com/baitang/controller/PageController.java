package com.baitang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/loginpage")
	public String getpage(String page){
		return page;
	}

}
