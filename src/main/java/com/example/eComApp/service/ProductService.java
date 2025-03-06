package com.example.eComApp.service;

import com.example.eComApp.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
@Component
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103,"Shure Mic",10000)));

    public List<Product> getProducts() {
        return products;
    }
    public Product getProductById(int proId){
        return  products.stream()
                .filter(p -> p.getProdId() == proId)
                .findFirst().orElse(new Product (  100,
                "No Item",  0));
    }
    public Product addProduct( Product prod){
        products.add(prod);
        return prod;
    }

    public List<Product>  updateProduct(Product prod) {
       for(int i=0;i<products.size();i++){
           if(products.get(i).getProdId()==prod.getProdId()){
               products.set(i,prod);
               return products;
           }

       }
        products.add(prod);
        return  products;
    }

    public Product deleteProductById(long proId) {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId()==proId){
                return products.remove(i);
            }
        }
        return new Product();
    }
}