package com.example.ForoHub.Autor;

import jakarta.validation.constraints.NotBlank;

public record DtoAutor(
                @NotBlank String nombre,

                @NotBlank String apellido) {
}
