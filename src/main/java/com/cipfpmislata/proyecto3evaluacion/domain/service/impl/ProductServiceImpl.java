package com.cipfpmislata.proyecto3evaluacion.domain.service.impl;

import java.util.List;

import com.cipfpmislata.proyecto3evaluacion.domain.entity.Product;
import com.cipfpmislata.proyecto3evaluacion.domain.service.ProductService;
import com.cipfpmislata.proyecto3evaluacion.exception.ResourceNotFoundException;
import com.cipfpmislata.proyecto3evaluacion.persistence.ProductRepository;
import com.cipfpmislata.proyecto3evaluacion.persistence.impl.ProductRepositoryImplJDBCTemplate;

public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository = new ProductRepositoryImplJDBCTemplate();

    @Override
    public List<Product> getByCategoryId(int category_id) {
        List<Product> products = productRepository.getByCategoryId(category_id);
        return products;
    }

    @Override
    public Product read(int id) throws ResourceNotFoundException {
        return productRepository.read(id);
    }
    
}
