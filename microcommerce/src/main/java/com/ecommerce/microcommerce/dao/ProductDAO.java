package com.ecommerce.microcommerce.dao;

import com.ecommerce.microcommerce.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {


    Product findById(int id);

    //List<Product> findByPrixGreaterThan(int prixLimit);
    List<Product> findByNomLike(String recherche);
    void deleteProducts(int id);
}
