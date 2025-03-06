package com.example.eComApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
    public Product(){

    }
}
