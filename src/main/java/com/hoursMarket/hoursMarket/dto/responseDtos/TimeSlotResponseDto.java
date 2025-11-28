package com.hoursMarket.hoursMarket.dto.responseDtos;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class TimeSlotResponseDto extends BaseResponseDto{

    @JsonView(Views.Internal.class)
    private Integer idUser;

    @JsonView(Views.Public.class)
    private Timestamp start;

    @JsonView(Views.Public.class)
    private Timestamp end;
}
