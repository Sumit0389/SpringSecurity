package com.security.test.SpringSecurityLearn.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.test.SpringSecurityLearn.dto.UserDto;

import lombok.Data;

@Service
public class UserService {
	
	private static List<UserDto> list= new ArrayList<>();
	
	public UserService()
	{
		list.add(new UserDto("Sumit","Incture1234","sumit.shrivastava@incture.com"));
		list.add(new UserDto("Aastha","Aatmik@2019","Aastha.s1994@gmail.com"));
	}
	
	public List<UserDto> getAllUsers()
	{
		return list;
	}
	public UserDto getUser(String user)
	{
    return this.list.stream().filter(userObject->userObject.getUserName().equals(user)).findAny().orElse(null);
	}
	public UserDto addUser(UserDto dto)
	{
		list.add(dto);
		return dto;
	}

}
