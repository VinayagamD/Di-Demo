package com.vinay.didemo.controllers;

import com.vinay.didemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
