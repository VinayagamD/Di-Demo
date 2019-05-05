package com.vinay.didemo;

import com.vinay.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(DIDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
    }

}
