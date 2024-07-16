package com.example.ForoHub.Topico;

import java.time.LocalDateTime;

public record DatosListadoTopicos(String titulo, String mensaje, LocalDateTime fechaDeCreacion, String estado,
        String autor, String curso) {

    public DatosListadoTopicos(Topico topic) {
        this(topic.getTitulo(), topic.getMensaje(), topic.getFechaDeCreacion(), topic.getEstado().toString(),
                "" + topic.getAutor().getNombre() + " " + topic.getAutor().getApellido(),
                topic.getCurso().getNombreCurso());
    }
}