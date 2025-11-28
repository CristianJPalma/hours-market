package com.hoursMarket.hoursMarket.dto.requestDtos;

import jakarta.validation.constraints.Email;
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
public class UserRequestDto extends BaseRequestDto{

    @NotBlank(message = "El email no puede estar vacío")
    @Email(message = "El email debe ser válido")
    @Size(max = 30, message = "El email no puede tener más de 30 caracteres")
    private String email;
    
    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(max = 150, message = "La contraseña no puede tener más de 150 caracteres")
    private String password;
    
    @NotNull(message = "El status no puede ser nulo")
    private byte status;
    
}

