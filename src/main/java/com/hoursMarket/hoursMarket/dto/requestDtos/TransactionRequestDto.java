package com.hoursMarket.hoursMarket.dto.requestDtos;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDto extends BaseRequestDto{

    @NotNull(message = "El id del match no puede ser nulo")
    private Integer idMatch;

    @NotNull(message = "El id del usuario emisor no puede ser nulo")
    private Integer idFromUser;

    @NotNull(message = "El id del usuario receptor no puede ser nulo")
    private Integer idToUser;

    @NotNull(message = "Las horas no pueden ser nulas")
    private Integer hours;

    @NotNull(message = "La fecha no puede ser nula")
    private LocalDate date;
}
