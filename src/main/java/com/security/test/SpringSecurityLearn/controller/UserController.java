package com.security.test.SpringSecurityLearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.test.SpringSecurityLearn.dto.UserDto;
import com.security.test.SpringSecurityLearn.services.UserService;
@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	
	
	
	@GetMapping("/Users")
	public List<UserDto> getAllUser()
	{
		return service.getAllUsers();
	}
@GetMapping("/Users/{name}")
	public UserDto getUserByName(@PathVariable String name)
	{
	return service.getUser(name);
	}
@PostMapping("/Users")
	public UserDto addUser(@RequestBody UserDto dto)
	{
		return service.addUser(dto);
	}
}
