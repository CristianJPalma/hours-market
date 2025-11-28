package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class LocationResponseDto extends BaseResponseDto{

    @JsonView(Views.Public.class)
    private String type;

    @JsonView(Views.Public.class)
    private String neighborhood_name;
    
}
