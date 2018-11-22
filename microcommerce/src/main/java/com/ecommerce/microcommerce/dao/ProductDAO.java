package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductDAO {

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
}
