package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/")
    public String getGreetings() {
        return helloService.getGreetings();
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return helloService.getProducts();
    }
}
