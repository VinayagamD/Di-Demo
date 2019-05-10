package com.vinay.didemo.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean , DisposableBean , BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleDemoBean Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleDemoBean has its properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleDemoBean destroyed");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("My Bean Name is "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The Post Construct Annotation has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The pre destroy annotation has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
