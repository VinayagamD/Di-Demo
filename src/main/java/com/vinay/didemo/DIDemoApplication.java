package com.vinay.didemo;

import com.vinay.didemo.controllers.ConstructorInjectedController;
import com.vinay.didemo.controllers.MyController;
import com.vinay.didemo.controllers.PropertyInjectedController;
import com.vinay.didemo.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.vinay.didemo.services","com.vinay.didemo.repositories"})
public class DIDemoApplication {

    public static void main(String[] args) {
       ApplicationContext ctx = SpringApplication.run(DIDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        String message = controller.hello();
        System.out.println(message);
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectionController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
