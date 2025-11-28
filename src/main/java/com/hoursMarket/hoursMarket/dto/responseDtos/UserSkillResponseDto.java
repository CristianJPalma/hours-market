package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class UserSkillResponseDto extends BaseResponseDto{

    @JsonView(Views.Internal.class)
    private int id_user;

    @JsonView(Views.Public.class)
    private int id_skill;

    @JsonView(Views.Public.class)
    private byte level;

    @JsonView(Views.Public.class)
    private byte priority;
}
