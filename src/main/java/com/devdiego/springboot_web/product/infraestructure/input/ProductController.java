package com.devdiego.springboot_web.product.infraestructure.input;

import com.devdiego.springboot_web.product.domain.Product;
import com.devdiego.springboot_web.product.domain.ProductRepository;
import com.devdiego.springboot_web.product.infraestructure.output.ProductApi;
import com.devdiego.springboot_web.product.mappers.ProductMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController implements ProductApi {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductController(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @GetMapping()
    public ResponseEntity response(@RequestParam String pagedSize) {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.findById(id);
    }


    @PostMapping
    public ResponseEntity saveProduct(@RequestBody Product productToBeSaved) {
        productRepository.upsert(productToBeSaved);
        return ResponseEntity.status(201).body(productToBeSaved);
    }

    @PutMapping()
    public ResponseEntity updateProduct(@RequestBody Product newInfoProduct) {
        productRepository.upsert(newInfoProduct);
        return ResponseEntity.ok(newInfoProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.status(204).build();
    }
}