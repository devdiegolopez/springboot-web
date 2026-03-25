package com.devdiego.springboot_web.product.domain.exceptions;

public class ProductException extends RuntimeException {
    private final ProductErrorMessage productErrorMessage;

    public ProductException(ProductErrorMessage productErrorMessage) {
        super(productErrorMessage.getDescription());
        this.productErrorMessage = productErrorMessage;
    }

    public ProductErrorMessage getProductError() {
        return productErrorMessage;
    }

}
