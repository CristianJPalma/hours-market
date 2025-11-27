package com.hoursMarket.hoursMarket.dto.responseDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto extends BaseResponseDto{

	private String email;
	
	private String password;
	
	private byte status;
}
