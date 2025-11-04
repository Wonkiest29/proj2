package dev.coffeedev.second_project.support.exception;

import dev.coffeedev.second_project.shared.api.response.ErrorMessageResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorMessageResponse> handleNotFound(ProductNotFoundException ex, WebRequest request) {
        ErrorMessageResponse body = new ErrorMessageResponse(Instant.now().toString(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMessageResponse> handleGeneric(Exception ex, WebRequest request) {
        ErrorMessageResponse body = new ErrorMessageResponse(Instant.now().toString(), ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(body);
    }
}

