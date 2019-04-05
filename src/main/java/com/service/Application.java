package com.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;
import javax.inject.Named;

@Named("App")
public class Application {

    @Inject@Named("HelloWorldService")
    iGreetingService greeting = null;


    public Application(){}
    public Application(iGreetingService greeting){
        this.greeting = greeting;
    }
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Application app = (Application)ctx.getBean("App");
        app.start();
    }
    public  void start(){
        if(greeting!=null)greeting.sendGreeting();
    }


}
