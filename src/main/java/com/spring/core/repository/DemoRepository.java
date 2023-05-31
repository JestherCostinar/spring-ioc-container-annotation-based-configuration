package com.spring.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String sayHello() {
        return "Hello from Repository";
    }
}
