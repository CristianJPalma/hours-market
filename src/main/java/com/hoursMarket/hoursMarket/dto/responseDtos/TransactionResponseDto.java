package com.hoursMarket.hoursMarket.dto.responseDtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class TransactionResponseDto extends BaseResponseDto{

    @JsonView(Views.Internal.class)
    private Integer idMatch;

    @JsonView(Views.Public.class)
    private Integer idFromUser;

    @JsonView(Views.Public.class)
    private Integer idToUser;

    @JsonView(Views.Public.class)
    private Integer hours;

    @JsonView(Views.Public.class)
    private LocalDate date;
}
