package com.lenhatthanh.demo.product;

import com.lenhatthanh.demo.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
