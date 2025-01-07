package com.shoppingkart.shoppingkart.services;

import com.shoppingkart.shoppingkart.dto.ProductDto;
import com.shoppingkart.shoppingkart.entities.Product;
import com.shoppingkart.shoppingkart.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product addproduct(ProductDto product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products=productRepository.findAll();
        return products;
    }
}
