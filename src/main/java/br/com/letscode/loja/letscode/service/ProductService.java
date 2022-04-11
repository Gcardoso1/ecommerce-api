package br.com.letscode.loja.letscode.service;

import br.com.letscode.loja.letscode.repository.ProductRepository;
import br.com.letscode.lojaletscode.domain.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    public void create(Product product) {
        ProductRepository.save(product);
    }
}
