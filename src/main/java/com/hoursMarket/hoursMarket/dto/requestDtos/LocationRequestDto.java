package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationRequestDto extends BaseRequestDto{

    @NotBlank(message = "El tipo no puede estar vacío")
    @Size(max = 50, message = "El tipo no puede tener más de 50 caracteres")
    private String type;

    @NotBlank(message = "El nombre del barrio no puede estar vacío")
    @Size(max = 100, message = "El nombre del barrio no puede tener más de 100 caracteres")
    private String neighborhood_name;
    
}
