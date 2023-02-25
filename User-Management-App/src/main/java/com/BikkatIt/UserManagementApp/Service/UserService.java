package com.BikkatIt.UserManagementApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkatIt.UserManagementApp.PayLoad.UserDto;

@Service
public interface UserService {

	 UserDto addUser(UserDto userDto);
	
	 UserDto getSingleUser(Integer userpassword);
	
	 List<UserDto> getAllUser();
	
	 void deleteUser(UserDto userDto);
}
