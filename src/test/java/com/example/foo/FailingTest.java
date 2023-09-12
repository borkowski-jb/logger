package com.example.foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailingTest {
    @Test
    void someTest(){
        Assertions.fail("AAAAA");
    }

    @Test
    void thisIsSuccessful(){

    }
}
