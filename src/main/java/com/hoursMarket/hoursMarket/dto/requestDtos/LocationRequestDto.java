package com.hoursMarket.hoursMarket.dto.requestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationRequestDto extends BaseRequestDto{

    private String type;

    private String neighborhood_name;
    
}
