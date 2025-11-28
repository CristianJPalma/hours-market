package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequestDto extends BaseRequestDto{

    @NotNull(message = "El id del usuario no puede ser nulo")
    private int id_user;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 20, message = "El nombre no puede tener más de 20 caracteres")
    private String name;

    @NotBlank(message = "La biografía no puede estar vacía")
    @Size(max = 50, message = "La biografía no puede tener más de 50 caracteres")
    private String bio;

    @Size(max = 20, message = "La URL de la foto no puede tener más de 20 caracteres")
    private String photo_url;

    @NotNull(message = "La calificación promedio no puede ser nula")
    @PositiveOrZero(message = "La calificación promedio debe ser mayor o igual a 0")
    private double average_rating;

    @NotNull(message = "El balance de horas no puede ser nulo")
    private double balance_hours;
}
