package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserSkillRequestDto extends BaseRequestDto{

    @NotNull(message = "El id del usuario no puede ser nulo")
    private int id_user;

    @NotNull(message = "El id de la habilidad no puede ser nulo")
    private int id_skill;

    @NotNull(message = "El nivel no puede ser nulo")
    private byte level;

    @NotNull(message = "La prioridad no puede ser nula")
    private byte priority;
}
