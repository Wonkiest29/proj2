package dev.coffeedev.second_project.support.exception;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> notFound(Long id) {
        return () -> new ProductNotFoundException("Product not found with id: " + id);
    }
}

