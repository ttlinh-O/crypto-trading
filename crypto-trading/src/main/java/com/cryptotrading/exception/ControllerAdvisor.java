package com.cryptotrading.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class ControllerAdvisor {

    @ResponseBody
    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<String> notFoundHandler(NotFoundException notFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFoundException.getLocalizedMessage());
    }

    @ResponseBody
    @ExceptionHandler(InvalidDataException.class)
    ResponseEntity<String> notFoundHandler(InvalidDataException invalidDataException) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(invalidDataException.getLocalizedMessage());
    }
}
