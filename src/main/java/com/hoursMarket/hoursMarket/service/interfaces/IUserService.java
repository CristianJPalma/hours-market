package com.hoursMarket.hoursMarket.service.interfaces;

import com.hoursMarket.hoursMarket.dto.requestDtos.UserRequestDto;
import com.hoursMarket.hoursMarket.dto.responseDtos.UserResponseDto;
import com.hoursMarket.hoursMarket.model.User;

public interface IUserService 
		extends IBaseService<User, UserRequestDto, UserResponseDto, Integer>{

}
