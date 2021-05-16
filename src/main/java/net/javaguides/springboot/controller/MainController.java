package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/Add")
	public String addStudent() {
		return "AddStudent";
	}
	
	@RequestMapping("/Schedule")
	public String studentSchedule() {
		return "StudentSchedule";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/Pay")
	public String studentPay() {
		return "StudentPay";
	}
}
