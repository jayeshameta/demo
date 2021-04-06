package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerClass {
    @Autowired
    private ServiceClass serviceClass;

    @PostMapping(value="/createProduct")
    public Product addProduct(@RequestBody Product product)
    {
        return serviceClass.addProduct(product);
    }

}
