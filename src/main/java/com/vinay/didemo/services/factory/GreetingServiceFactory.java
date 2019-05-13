package com.vinay.didemo.services.factory;

import com.vinay.didemo.repositories.GreetingRepository;
import com.vinay.didemo.services.GreetingService;
import com.vinay.didemo.services.impl.PrimaryGermanGreetingService;
import com.vinay.didemo.services.impl.PrimaryGreetingService;
import com.vinay.didemo.services.impl.PrimarySpanishGreetingService;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
