package com.hoursMarket.hoursMarket.controller.implement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoursMarket.hoursMarket.controller.interfaces.IUserController;
import com.hoursMarket.hoursMarket.dto.requestDtos.UserRequestDto;
import com.hoursMarket.hoursMarket.dto.responseDtos.UserResponseDto;
import com.hoursMarket.hoursMarket.model.User;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "User Controller", description = "Endpoints for managing users")
@RequestMapping("/users")
public class UserController 
	extends BaseController<User, UserRequestDto, UserResponseDto, Integer> implements IUserController{

}
