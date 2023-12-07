package com.example.springboot;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Service
public class HelloService {

    private final List<Product> products = Arrays.asList(
            new Product("name1", new BigDecimal("12.6")),
            new Product("name2", new BigDecimal("33")));

    public String getGreetings() {
        return "Greetings from Spring Boot!";
    }

    public List<Integer> getA() {
        return products.stream()
                .map(p -> p.getPrice().intValue() * 2)
                .collect(Collectors.toList());
    }

    public List<Product> getB() {
        int[] n1 = new int[0];
        return products.stream()
                .peek(p -> p.setPrice(new BigDecimal(p.getPrice().intValue() + 1)))
                .collect(Collectors.toList());

    }
}
