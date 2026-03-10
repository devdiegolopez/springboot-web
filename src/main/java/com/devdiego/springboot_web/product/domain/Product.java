package com.devdiego.springboot_web.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    String name;
    String description;
    Double price;
    String image;
}
