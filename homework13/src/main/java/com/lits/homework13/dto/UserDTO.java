package com.lits.homework13.dto;

import lombok.Data;
import javax.validation.constraints.*;

@Data
public class UserDTO {
    private Long id;
    @NotBlank(message = "username cannot be empty")
    private String username;
    @Email(message = "invalid email")
    private String email;
    @Min(18)
    @Max(65)
    private int age;
    @Min(100)
    private int salary;
}
