package com.security.test.SpringSecurityLearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Public")
public class HoleController {

	@GetMapping("/Home")
	public String home()
	{
		return "Hi Home";
	}
	@GetMapping("/Login")
	public String loginPage()
	{
		return "Hi Home";
	}
	@GetMapping("/Register")
	public String registerPage()
	{
		return "Hi Home";
	}
}
