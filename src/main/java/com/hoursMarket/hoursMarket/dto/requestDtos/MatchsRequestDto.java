package com.hoursMarket.hoursMarket.dto.requestDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatchsRequestDto extends BaseRequestDto{

	public int id_offer;
	
	public int id_request;
	
	public int id_time_slot;
	
	public int reserved_hours;
}
