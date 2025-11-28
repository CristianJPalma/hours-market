package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class RequestResponseDto extends BaseResponseDto{

    @JsonView(Views.Public.class)
    private Integer idUser;

    @JsonView(Views.Public.class)
    private Integer idLocation;

    @JsonView(Views.Public.class)
    private String title;

    @JsonView(Views.Public.class)
    private String description;

    @JsonView(Views.Public.class)
    private Byte hoursRequest;
}
