package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OfferRequestDto extends BaseRequestDto{

    @NotNull(message = "El id del usuario no puede ser nulo")
    private Integer idUser;

    @NotNull(message = "El id de la ubicación no puede ser nulo")
    private Integer idLocation;

    @NotBlank(message = "El título no puede estar vacío")
    @Size(max = 100, message = "El título no puede tener más de 100 caracteres")
    private String title;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 500, message = "La descripción no puede tener más de 500 caracteres")
    private String description;

    @NotNull(message = "Las horas máximas no pueden ser nulas")
    private Byte maxHours;
}
