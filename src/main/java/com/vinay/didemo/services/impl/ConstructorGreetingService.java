package com.vinay.didemo.services.impl;

import com.vinay.didemo.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello I was injected with the constructor";
    }
}
