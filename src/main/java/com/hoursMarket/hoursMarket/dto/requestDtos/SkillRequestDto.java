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
public class SkillRequestDto extends BaseRequestDto{

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 20, message = "El nombre no puede tener más de 20 caracteres")
    private String name;

    @NotBlank(message = "La categoría no puede estar vacía")
    @Size(max = 20, message = "La categoría no puede tener más de 20 caracteres")
    private String category;

    @NotNull(message = "El status no puede ser nulo")
    private int status;
}
