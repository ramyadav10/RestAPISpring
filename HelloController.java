package com.mastercode.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("hello")
	public String hello(HttpServletRequest req) {
		HttpSession hs=req.getSession();
		String name=req.getParameter("name");
		hs.setAttribute("name", name);
		
	return "hello.jsp";
	}
}
