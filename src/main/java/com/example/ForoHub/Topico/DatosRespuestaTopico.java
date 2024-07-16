package com.example.ForoHub.Topico;

import com.example.ForoHub.Autor.DtoAutor;
import com.example.ForoHub.Curso.DtoCurso;

public record DatosRespuestaTopico(Long id, String titulo,
                String mensaje, DtoAutor autor, DtoCurso curso) {

}
