package com.BikkatIt.UserManagementApp.ServiceIMPL;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkatIt.UserManagementApp.Entity.User;
import com.BikkatIt.UserManagementApp.Exception.ResourceNotFoundException;
import com.BikkatIt.UserManagementApp.PayLoad.UserDto;
import com.BikkatIt.UserManagementApp.Repository.UserRepository;
import com.BikkatIt.UserManagementApp.Service.UserService;

@Service
public class UserServiceIMPL implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto addUser(UserDto userDto) {
		User user = this.modelMapper.map(userDto, User.class);
		User user2 = this.userRepository.save(user);
		return this.modelMapper.map(user2, UserDto.class);
	}

	@Override
	public UserDto getSingleUser(Integer userPassword) {
		User user = this.userRepository.findById(userPassword)
		.orElseThrow(()-> new ResourceNotFoundException("Resource Not Found"+userPassword));
		UserDto userDto = this.modelMapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(UserDto userDto) {
		// TODO Auto-generated method stub

	}

}
