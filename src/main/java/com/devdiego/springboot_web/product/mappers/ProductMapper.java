package com.devdiego.springboot_web.product.mappers;

import com.devdiego.springboot_web.product.domain.Product;
import com.devdiego.springboot_web.product.domain.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "price", target = "price")
    ProductDto productToProductDto(Product product);
}
