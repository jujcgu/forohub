package com.example.ForoHub.Curso;

import jakarta.validation.constraints.NotBlank;

public record DtoCurso(
                @NotBlank String nombreCurso,

                @NotBlank String nombreProfesor) {
}