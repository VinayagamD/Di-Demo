package com.vinay.didemo.controllers;

import com.vinay.didemo.services.GreetingService;

public class SetterInjectionController {

    private GreetingService  greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
