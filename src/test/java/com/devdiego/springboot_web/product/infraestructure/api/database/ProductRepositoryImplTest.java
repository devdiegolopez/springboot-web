package com.devdiego.springboot_web.product.infraestructure.api.database;

import com.devdiego.springboot_web.product.infraestructure.output.ProductJpaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ProductRepositoryImplTest {
    ProductJpaRepository productRepository = Mockito.mock(ProductJpaRepository.class);
    ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl(productRepository);

    @Test
    public void upsertTest() {

    }
}
