package com.ldxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {


	@RequestMapping("/addCookie")
	public void selectAllUSignin( HttpServletResponse response) {
		Cookie cookie = new Cookie("ldxx","xianing123");
		cookie.setPath("/");
		cookie.setMaxAge(3600);
		cookie.setDomain("localhost");
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
	}

	@RequestMapping("/loginS")
	public String loginS() {
		return "redirect:http://127.0.0.1:8080/loginS.html";
	}

	@RequestMapping("/loginSON")
	public String loginSON() {
		return "redirect:/index.html";
	}

	@RequestMapping("/toIndex")
	public String toIndex() {
		return "forword:/index.html";
	}

}
