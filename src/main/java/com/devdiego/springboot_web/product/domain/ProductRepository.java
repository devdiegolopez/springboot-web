package com.devdiego.springboot_web.product.domain;


import java.util.List;

public interface ProductRepository {
    void upsert(Product product);

    Product findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);
}
