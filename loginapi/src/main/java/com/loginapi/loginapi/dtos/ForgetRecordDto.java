package com.loginapi.loginapi.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record ForgetRecordDto(@NotNull @NotEmpty @Email String email) {
    
}
