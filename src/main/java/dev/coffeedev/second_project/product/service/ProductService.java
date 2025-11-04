package dev.coffeedev.second_project.product.service;

import dev.coffeedev.second_project.product.api.request.ProductRequest;
import dev.coffeedev.second_project.product.api.response.ProductResponse;
import dev.coffeedev.second_project.product.domain.Product;
import dev.coffeedev.second_project.product.repository.ProductRepository;
import dev.coffeedev.second_project.product.support.ProductMapper;
import dev.coffeedev.second_project.support.exception.ProductExceptionSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    @Autowired
    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product entity = mapper.toEntity(request);
        Product saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    public ProductResponse getById(Long id) {
        Product product = repository.findById(id).orElseThrow(ProductExceptionSupplier.notFound(id));
        return mapper.toResponse(product);
    }

    public List<ProductResponse> getAll() {
        return repository.findAll().stream().map(mapper::toResponse).collect(Collectors.toList());
    }

    public ProductResponse update(Long id, ProductRequest request) {
        Product product = repository.findById(id).orElseThrow(ProductExceptionSupplier.notFound(id));
        mapper.updateEntity(product, request);
        Product saved = repository.save(product);
        return mapper.toResponse(saved);
    }

    public void delete(Long id) {
        Product product = repository.findById(id).orElseThrow(ProductExceptionSupplier.notFound(id));
        repository.delete(product);
    }
}

