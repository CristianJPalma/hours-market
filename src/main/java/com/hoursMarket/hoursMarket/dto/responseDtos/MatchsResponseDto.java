package com.hoursMarket.hoursMarket.dto.responseDtos;

import com.fasterxml.jackson.annotation.JsonView;
import com.hoursMarket.hoursMarket.dto.requestDtos.view.Views;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class MatchsResponseDto extends BaseResponseDto{

	@JsonView(Views.Public.class)
	private int id_offer;
	
	@JsonView(Views.Public.class)
	private int id_request;
	
	@JsonView(Views.Internal.class)
	private int id_time_slot;
	
	@JsonView(Views.Public.class)
	private int reserved_hours;
}
