package com.adr.ihandler;

// Interfaz para la abstracción de manejo de excepciones
public interface IMemoryHandler {
    
    // Método para añadir una excepción.
    void addException(String excepMessage);
    
    // Método para mostrar las excepciones almacenadas.
    void showStoredException();
    
}
