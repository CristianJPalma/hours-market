package com.hoursMarket.hoursMarket.dto.requestDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationRequestDto extends BaseRequestDto{

    public String type;

    public String neighborhood_name;
    
}
