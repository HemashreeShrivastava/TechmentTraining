package com.techment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.dto.UserDto;
import com.techment.entity.User;

@RestController
@RequestMapping(value="login")
public class UserCotroller {

	public ResponseEntity<UserDto> login(@RequestBody User user)
	{
		return new ResponseEntity<UserDto>(body, Http.)
	}
}
