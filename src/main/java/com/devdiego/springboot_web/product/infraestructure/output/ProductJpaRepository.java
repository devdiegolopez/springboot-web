package com.devdiego.springboot_web.product.infraestructure.output;

import com.devdiego.springboot_web.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product, Long> {
}
