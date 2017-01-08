package com.yangtze.film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yangtze.film.entities.UserInfo;

@Controller
@RequestMapping("/user")
@SessionAttributes("userInfo")
public class UserInfoController {

	
	@RequestMapping("/register")
	public String register(UserInfo user,Model model){
		
	}
	
	@RequestMapping("/login")
	public String login(UserInfo user,Model model){
		
	}
}
