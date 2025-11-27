package com.hoursMarket.hoursMarket.dto.requestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchsRequestDto extends BaseRequestDto{

	private int id_offer;
	
	private int id_request;
	
	private int id_time_slot;
	
	private int reserved_hours;
}
