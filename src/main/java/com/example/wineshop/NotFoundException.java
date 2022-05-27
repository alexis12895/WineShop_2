package com.example.wineshop;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Long id) {
        super("No se ha encontrado" + id);
    }
}
