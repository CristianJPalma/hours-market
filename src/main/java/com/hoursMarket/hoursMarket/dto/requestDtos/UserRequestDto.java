package com.hoursMarket.hoursMarket.dto.requestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDto extends BaseRequestDto{

    private String email;
    private String password;
    private byte status;
    
}

