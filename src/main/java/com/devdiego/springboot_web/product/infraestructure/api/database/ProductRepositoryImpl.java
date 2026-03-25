package com.devdiego.springboot_web.product.infraestructure.api.database;

import com.devdiego.springboot_web.product.domain.Product;
import com.devdiego.springboot_web.product.domain.ProductRepository;
import com.devdiego.springboot_web.product.domain.exceptions.ProductErrorMessage;
import com.devdiego.springboot_web.product.domain.exceptions.ProductException;
import com.devdiego.springboot_web.product.infraestructure.output.ProductJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRepositoryImpl implements ProductRepository {
    private final ProductJpaRepository productJpaRepository;

    public ProductRepositoryImpl(ProductJpaRepository productJpaRepository) {
        this.productJpaRepository = productJpaRepository;
    }

    @Override
    public void upsert(Product product) {
        productJpaRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productJpaRepository.findById(id)
                .orElseThrow(() -> new ProductException(ProductErrorMessage.PRODUCT_NOT_FOUND));
    }

    @Override
    public List<Product> findAll() {
        return productJpaRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        productJpaRepository.deleteById(id);
    }
}
