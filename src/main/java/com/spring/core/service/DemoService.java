package com.spring.core.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String sayHello() {
        return "Hello from Service";
    }
}
