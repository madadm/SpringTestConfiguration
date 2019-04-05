package com.service;


import javax.inject.Named;

@Named("HelloWorldService")
public class HelloWorldService implements iGreetingService {
    public String str;


    public HelloWorldService() {
        str = "";
    }

    public HelloWorldService(String str) {
        this.str = str;
    }

    public void sendGreeting() {
        System.out.println("Hello, world!" + str);
    }

}
