package com.master.firstwebspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWebController {
	@RequestMapping("/")
	public String hello() {
		return "Hello from BridgeLabz";
	}
	@RequestMapping("/web/message")
	public String message(Model mv) {
		mv.addAttribute("message", "This is Custom Message");
		return "message";
	}
}
