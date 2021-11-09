package com.example.demo.junit.concepto3;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * El método assertAll() permite evaluar múltiples assert a la vez
 * independientemente de que uno de ellos falle, no detiene la ejecución de los demás assert
 */
public class AssertAllTest {

    @Test
    void countTest(){
        System.out.println("countTest");
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        Integer num = service.count();
        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);
    }

    @Test
    void countTest2(){
        System.out.println("countTest");
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        Integer num = service.count();
        assertAll(
                () -> assertNotNull(num), // este da error
                () -> assertTrue(num > 0), // este sí se evalúa, no da error
                () -> assertEquals(3, num), // este sí se evalúa, pero da error
                () -> assertFalse(num < 0) // este sí se evalúa
        );
    }
}
