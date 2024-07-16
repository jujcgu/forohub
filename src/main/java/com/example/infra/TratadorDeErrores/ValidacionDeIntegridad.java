package com.example.infra.TratadorDeErrores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String mensaje) {
        super(mensaje);
    }
}