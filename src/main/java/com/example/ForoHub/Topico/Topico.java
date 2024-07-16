package com.example.ForoHub.Topico;

import com.example.ForoHub.Curso.Curso;
import com.example.ForoHub.Autor.Autor;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topico")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String mensaje;

    @Column(name = "fecha")
    private LocalDateTime fechaDeCreacion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Embedded
    private Autor autor;

    @Embedded
    private Curso curso;

    public Topico(DatosRegistroTopico topic) {
        this.titulo = topic.titulo();
        this.mensaje = topic.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
        this.estado = topic.estado();
        this.autor = new Autor(topic.autor());
        this.curso = new Curso(topic.curso());
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }
        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.estado() != null) {
            this.estado = Estado.valueOf(datosActualizarTopico.estado());
        }
        if (datosActualizarTopico.autor() != null) {
            this.autor = autor.actualizarAutor(datosActualizarTopico.autor());
        }
        if (datosActualizarTopico.curso() != null) {
            this.curso = curso.actualizarCurso(datosActualizarTopico.curso());
        }
    }
}