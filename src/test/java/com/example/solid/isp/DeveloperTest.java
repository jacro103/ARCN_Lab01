package com.example.solid.isp;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeveloperTest {

    @Test
    public void testWork_printsCorrectMessage() {
        // Redirigimos la salida estándar para capturar lo que se imprime en la consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Creamos una instancia de Developer
        Developer developer = new Developer();

        // Llamamos al método work
        developer.work();

        // Convertimos el contenido capturado a un String
        String output = outputStream.toString();

        // Verificamos que el mensaje correcto se haya impreso
        assertTrue(output.contains("Escribiendo código..."));

        // Restauramos la salida estándar para no afectar otras pruebas
        System.setOut(System.out);
    }
}

