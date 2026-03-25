package com.devdiego.springboot_web.product.infraestructure.input.handler;

import com.devdiego.springboot_web.product.domain.exceptions.ErrorResponseDto;
import com.devdiego.springboot_web.product.domain.exceptions.ProductErrorMessage;
import com.devdiego.springboot_web.product.domain.exceptions.ProductException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductException.class)
    public ResponseEntity<ErrorResponseDto> handleProductException(ProductException exception) {
        ProductErrorMessage error = exception.getProductError();
        ErrorResponseDto body = new ErrorResponseDto(
                error.getStatus().value(),
                error.name(),
                error.getDescription(),
                LocalDateTime.now()
        );
        return ResponseEntity.status(error.getStatus()).body(body);
    }
}
