package dev.coffeedev.second_project.product.support;

import dev.coffeedev.second_project.product.api.request.ProductRequest;
import dev.coffeedev.second_project.product.api.response.ProductResponse;
import dev.coffeedev.second_project.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toEntity(ProductRequest request) {
        if (request == null) return null;
        return new Product(request.getName(), request.getDescription(), request.getPrice());
    }

    public ProductResponse toResponse(Product product) {
        if (product == null) return null;
        return new ProductResponse(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }

    public void updateEntity(Product product, ProductRequest request) {
        if (product == null || request == null) return;
        product.setName(request.getName());
        product.setDescription(request.getDescription());
        product.setPrice(request.getPrice());
    }
}

