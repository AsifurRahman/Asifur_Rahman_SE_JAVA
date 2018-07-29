package com.ict.ecomApp.dao;

import com.ict.ecomApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where p.id = ?")
    Product getProductById(Integer productId);
}