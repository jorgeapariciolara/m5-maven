package com.example.demo.junit.concepto1;

import com.example.demo.domain.SmartPhone;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Las aserciones permiten realizar comprobaciones sobre el código a testear.
 *
 * Si se cumplen las aserciones entonces el test es correcto y se ejecuta con éxito resultando en color verde.
 * Si no se cumplen las aserciones entonces el test es fallido y aparecerá en rojo
 */
public class AssertionsTest {

    @Test
    public void countTest(){
        System.out.println("countTest");

        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();

        Integer num = service.count();

        assertAll(
                () -> assertNotNull(num),
                () -> assertTrue(num > 0),
                () -> assertEquals(3, num)
        );
        /*
        assertNotNull(num);
        assertTrue(num > 0);
        assertEquals(3, num);
        */
    }

    @Test
    public void findAllTest(){
        SmartPhoneServiceImpl service = new SmartPhoneServiceImpl();
        List<SmartPhone> smartphones =  service.findAll();

        assertAll(
                () -> assertNotNull(smartphones),
                () -> assertEquals(3, smartphones.size())
        );

        /*
        assertNotNull(smartphones);
        assertEquals(3, smartphones.size());
         */
    }
}
