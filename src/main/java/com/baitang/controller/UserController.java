package com.baitang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baitang.pojo.User;
import com.baitang.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/login")
	public String login(User user,Model model){
		
		User userl = userService.login(user);
		
		model.addAttribute("user", userl);
		return "success";
	}
	
	@RequestMapping("/user/update")
	public String update(User user){
		
		userService.update(user);
		
		return "login";
	}

}
