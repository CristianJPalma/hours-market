package com.hoursMarket.hoursMarket.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hoursMarket.hoursMarket.dto.requestDtos.UserRequestDto;
import com.hoursMarket.hoursMarket.dto.responseDtos.UserResponseDto;
import com.hoursMarket.hoursMarket.model.User;
import com.hoursMarket.hoursMarket.repository.IUserRepository;
import com.hoursMarket.hoursMarket.service.interfaces.IUserService;

@Service
public class UserService
		extends BaseService<User, UserRequestDto, UserResponseDto, Integer>
			implements IUserService{

	@Autowired
	private IUserRepository repo;
	
	@Override
	public User dtoToModel(UserRequestDto dRequest) {
		return new User(
				dRequest.getEmail(),
				dRequest.getPassword(),
				dRequest.getStatus()
				);
	} 
	
	@Override
	public UserResponseDto modelToDto(User user) {
		return new UserResponseDto();
	}
}
