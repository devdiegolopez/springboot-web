package com.devdiego.springboot_web.product.domain.exceptions;

import org.springframework.http.HttpStatus;

public enum ProductErrorMessage {
    PRODUCT_NOT_FOUND(HttpStatus.NOT_FOUND, "Product not found"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "Bad request"),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Something wrong happened");
    private final HttpStatus httpStatus;
    private final String description;

    ProductErrorMessage(HttpStatus httpStatus, String description) {
        this.httpStatus = httpStatus;
        this.description = description;
    }

    public HttpStatus getStatus() {
        return httpStatus;
    }

    public String getDescription() {
        return description;
    }
}
