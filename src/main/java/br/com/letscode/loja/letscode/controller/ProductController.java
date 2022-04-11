package br.com.letscode.loja.letscode.controller;

import br.com.letscode.loja.letscode.domain.Product;
import br.com.letscode.loja.letscode.repository.ProductRepository;
import br.com.letscode.loja.letscode.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-letscode")
public class ProductController {

    private final ProductService productService;

    public ResponseEntity<String> create(@RequestBody Product product){
        productService.create(product);
        return new ResponseEntity<>("Client registered successfully", HttpStatus.OK);
    }
}
