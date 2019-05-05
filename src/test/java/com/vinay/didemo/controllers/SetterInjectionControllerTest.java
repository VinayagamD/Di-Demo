package com.vinay.didemo.controllers;

import com.vinay.didemo.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectionControllerTest {

    private SetterInjectionController setterInjectionController;

    @Before
    public void setUp(){
        this.setterInjectionController = new SetterInjectionController();
        this.setterInjectionController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectionController.sayHello());
    }
}