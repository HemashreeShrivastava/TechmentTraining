package com.techment.service;

import org.apache.catalina.User;

import com.techment.dto.UserDto;
import com.techment.repository.UserRepository;

public class UserServiceImpl implements IUserService {
	UserRepository userRepository;
	@Override
	public UserDto login(String userName, String password) {
		// TODO Auto-generated method stub
		User user=userRepository.findByUsernameAndPassword(userName, password);
		UserDto userDto = new UserDto(user.getUsername(),user.getPassword());
		return null;
	}

}
