package com.hoursMarket.hoursMarket.dto.responseDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto extends BaseResponseDto{

	public String email;
	
	public String password;
	
	public byte status;
}
