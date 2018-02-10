package com.oasystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oasystem.pojo.TUser;
import com.oasystem.services.UserService;

@Controller
public class LoginAction {
	@Autowired
	private UserService userService;
	@RequestMapping("userLogin")
	public String userLogin(String username,String password) {
		TUser loginUser = new TUser();
		loginUser.setUsername(username);
		loginUser.setPassword(password);
 		TUser queryUser = userService.queryUser(loginUser);
		System.out.println(queryUser);
		if(null != queryUser && "".equalsIgnoreCase(queryUser.getUsername())) {
			System.out.println(123);
			return "home";
		}else {
			System.out.println(122223);
			//没有通过则返回登录页面
			return "login";
		}
	}
}
