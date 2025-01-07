package com.shoppingkart.shoppingkart.controllers;

import com.shoppingkart.shoppingkart.dto.ProductDto;
import com.shoppingkart.shoppingkart.entities.Product;
import com.shoppingkart.shoppingkart.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        List<Product> productList=new ArrayList<>();
        productList=productService.getAllProducts();
        return productList;
    }

    @PostMapping()
    public ProductDto createProduct(@RequestBody ProductDto product){
        return null;
    }
}
