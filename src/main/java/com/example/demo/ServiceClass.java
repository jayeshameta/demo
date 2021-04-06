package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ServiceClass {
    private List<Product> products= new ArrayList<>(Arrays.asList(
            new Product("Prod1","Shirt","EACH","Exists"),
            new Product("Prod2","Trouser","EACH","Exists"),
            new Product("Prod3","Tie","EACH","Exists")));

    public Product addProduct(Product product){
        Product pFound=products.stream().filter(p -> p.getProductId().equals(product.getProductId())).findFirst().get();
        if(pFound==null){
            Product newProduct=new Product(product.getProductId(),product.getProductName(),product.getUnitOfMeasure(),"Created");
            return newProduct;
        }
        return pFound;

    }
}

