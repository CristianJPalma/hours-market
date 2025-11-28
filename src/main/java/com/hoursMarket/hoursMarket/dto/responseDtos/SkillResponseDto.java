package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class SkillResponseDto extends BaseResponseDto{

    @JsonView(Views.Public.class)
    private String name;

    @JsonView(Views.Public.class)
    private String category;

    @JsonView(Views.Public.class)
    private int status;
}
