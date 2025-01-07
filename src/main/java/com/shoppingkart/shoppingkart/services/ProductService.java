package com.shoppingkart.shoppingkart.services;

import com.shoppingkart.shoppingkart.dto.ProductDto;
import com.shoppingkart.shoppingkart.entities.Product;

import java.util.List;

public interface ProductService {
    public Product addproduct(ProductDto product);
    public List<Product> getAllProducts();
}
