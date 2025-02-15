package com.example.solid.dip.GoodExample;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {

    @Test
    public void testProcessOrder_printsMessagesAndCallsSaveOrder() {
        Database mockDatabase = mock(Database.class);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        OrderProcessor orderProcessor = new OrderProcessor(mockDatabase);

        orderProcessor.processOrder();

        String output = outputStream.toString();

        assertTrue(output.contains("Procesando pedido..."));
        
        verify(mockDatabase).saveOrder();
        
        System.setOut(System.out);
    }
}
