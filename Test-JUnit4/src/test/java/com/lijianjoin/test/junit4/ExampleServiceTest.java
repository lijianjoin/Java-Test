package com.lijianjoin.test.junit4;

import com.lijianjoin.test.junit4.ExampleService;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ExampleServiceTest {

    private ExampleService testService;

    @Before
    public void setUp() throws Exception {
        testService = new ExampleService();
    }

    @BeforeClass
    public static void beforeTestClass() {
        System.out.println("Here should be initialize the test context");
    }

    @AfterClass
    public static void afterTestClass() {
        System.out.println("Here should be clean the test context");
    }

    @After
    public void endTest() {
        System.out.println("Here should be clean the test footprint");
        System.out.println("If any non-memory database is used, here should be clean the database");
    }

    @Test
    public void testMultiply() {
        assertEquals( "Regular multiplication should work", testService.multiply(4,5), 20);

    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,  testService.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0, testService.multiply(5,0));
    }

}
