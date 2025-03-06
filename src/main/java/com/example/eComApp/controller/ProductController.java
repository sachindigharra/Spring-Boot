package com.example.eComApp.controller;

import com.example.eComApp.model.Product;
import com.example.eComApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @GetMapping("/products/{proId}")
    public Product getProductById(@PathVariable int proId){

        return service.getProductById(proId);
    }
    @PostMapping("/products")
    public Product addProd(@RequestBody Product prod){
         return  service.addProduct(prod);
    }

    @PutMapping("/products")
    public List<Product> updateProduct(@RequestBody Product prod){
        return  service.updateProduct(prod);

    }
    @DeleteMapping("/products/{proId}")
    public Product deleteProduct(@PathVariable long proId){
         return service.deleteProductById(proId);
    }

}

