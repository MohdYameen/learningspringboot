package com.conceptandcoding.learningspringboot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    Adder adder = new Adder();

    @Test
    void testadd(){
        assertEquals(5, adder.add(2,3));
    }
}
