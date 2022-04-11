package br.com.letscode.loja.letscode.repository;

import br.com.letscode.loja.letscode.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    static void save(br.com.letscode.lojaletscode.domain.Product product) {
    }
}
