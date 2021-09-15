package com.HomeWork.JUnit;

import org.junit.jupiter.api.*;

public class DemoTest {

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll run once before all test");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("AfterAll run once after all test");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("BeforeEach run before each test");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each run after all test");
    }

    @Test
    public void test1(){
        System.out.println("test1 is running");
    }

    @Test
    public void test2(){
        System.out.println("test2 is running");
    }

}
