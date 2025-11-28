package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchsRequestDto extends BaseRequestDto{

	@NotNull(message = "El id de la oferta no puede ser nulo")
	@Positive(message = "El id de la oferta debe ser positivo")
	private int id_offer;
	
	@NotNull(message = "El id de la solicitud no puede ser nulo")
	@Positive(message = "El id de la solicitud debe ser positivo")
	private int id_request;
	
	@NotNull(message = "El id de la franja horaria no puede ser nulo")
	@Positive(message = "El id de la franja horaria debe ser positivo")
	private int id_time_slot;
	
	@NotNull(message = "Las horas reservadas no pueden ser nulas")
	@Positive(message = "Las horas reservadas deben ser positivas")
	private int reserved_hours;
}
