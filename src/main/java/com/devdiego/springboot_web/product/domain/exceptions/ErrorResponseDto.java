package com.devdiego.springboot_web.product.domain.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ErrorResponseDto {
    private final int status;
    private final String code;
    private final String message;
    private final LocalDateTime timestamp;
}
