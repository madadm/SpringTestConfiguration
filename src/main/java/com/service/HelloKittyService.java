package com.service;

import javax.inject.Named;

@Named("HelloKittyService")
public class HelloKittyService implements iGreetingService {
    public void sendGreeting() {
        System.out.println("Hello, Kitty!");
    }
}
