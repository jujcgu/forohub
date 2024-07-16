package com.example.ForoHub.Autor;

import jakarta.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Autor {

    private String nombre;
    private String apellido;

    public Autor(DtoAutor autor) {
        this.nombre = autor.nombre();
        this.apellido = autor.apellido();
    }

    public Autor actualizarAutor(DtoAutor autor) {
        this.nombre = autor.nombre();
        this.apellido = autor.apellido();
        return this;
    }
}
