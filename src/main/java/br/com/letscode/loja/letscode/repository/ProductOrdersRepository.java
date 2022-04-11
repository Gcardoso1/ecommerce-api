package br.com.letscode.loja.letscode.repository;

import br.com.letscode.loja.letscode.domain.ProductOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrdersRepository extends JpaRepository<ProductOrders, Long> {
}
