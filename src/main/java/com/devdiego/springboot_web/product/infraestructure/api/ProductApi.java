package com.devdiego.springboot_web.product.infraestructure.api;

import com.devdiego.springboot_web.product.domain.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequestMapping("/api/v1/products")
public interface ProductApi {
    ResponseEntity response(@RequestParam String pagedSize);

    Optional<Product> getProductById(@PathVariable Long id);

    ResponseEntity saveProduct(@RequestBody Product productToBeSaved);

    ResponseEntity updateProduct(@RequestBody Product newInfoProduct);

    ResponseEntity deleteById(@PathVariable Long id);


}
