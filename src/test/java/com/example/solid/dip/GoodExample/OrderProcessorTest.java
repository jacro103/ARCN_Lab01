package com.example.solid.dip.GoodExample;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {

    @Test
    public void testProcessOrder_printsMessages() {
        // Redirigimos la salida estándar a un ByteArrayOutputStream para capturar los mensajes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Creamos una instancia de OrderProcessor
        OrderProcessor orderProcessor = new OrderProcessor();
        
        // Llamamos al método processOrder
        orderProcessor.processOrder();
        
        // Convertimos el contenido capturado en un string
        String output = outputStream.toString();

        // Verificamos que los mensajes correctos estén en la salida
        assertTrue(output.contains("Procesando pedido..."));
        assertTrue(output.contains("Guardando pedido en MySQL..."));

        // Restauramos la salida estándar para evitar efectos secundarios en otras pruebas
        System.setOut(System.out);
    }
}


