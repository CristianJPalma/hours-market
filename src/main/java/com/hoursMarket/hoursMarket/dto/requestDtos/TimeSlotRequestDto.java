package com.hoursMarket.hoursMarket.dto.requestDtos;

import java.sql.Timestamp;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TimeSlotRequestDto extends BaseRequestDto{

    @NotNull(message = "El id del usuario no puede ser nulo")
    private Integer idUser;

    @NotNull(message = "La fecha de inicio no puede ser nula")
    private Timestamp start;

    @NotNull(message = "La fecha de fin no puede ser nula")
    private Timestamp end;
}
