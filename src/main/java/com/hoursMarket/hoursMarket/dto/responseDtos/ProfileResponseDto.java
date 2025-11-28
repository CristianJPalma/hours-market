package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class ProfileResponseDto extends BaseResponseDto{

    @JsonView(Views.Internal.class)
    private int id_user;

    @JsonView(Views.Public.class)
    private String name;

    @JsonView(Views.Public.class)
    private String bio;

    @JsonView(Views.Public.class)
    private String photo_url;

    @JsonView(Views.Public.class)
    private double average_rating;

    @JsonView(Views.Public.class)
    private double balance_hours;
}
