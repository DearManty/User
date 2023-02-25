package com.BikkatIt.UserManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkatIt.UserManagementApp.PayLoad.UserDto;
import com.BikkatIt.UserManagementApp.Service.UserService;

@RestController
@RequestMapping("/Userapp")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
		UserDto addUser = this.userService.addUser(userDto);

		return new ResponseEntity<UserDto>(addUser, HttpStatus.CREATED);

	}
	@GetMapping("/get/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userPassword){
		UserDto singleUser = this.userService.getSingleUser(userPassword);
		return new ResponseEntity<UserDto>(singleUser,HttpStatus.OK);
		
	}
}
