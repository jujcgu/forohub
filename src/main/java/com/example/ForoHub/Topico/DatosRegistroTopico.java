package com.example.ForoHub.Topico;

import com.example.ForoHub.Autor.DtoAutor;
import com.example.ForoHub.Curso.DtoCurso;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
                @NotBlank String titulo,

                
                @Valid @NotNull Estado estado,

                @NotBlank String mensaje,

                @NotNull @Valid DtoAutor autor,
                @NotNull @Valid DtoCurso curso) {
}