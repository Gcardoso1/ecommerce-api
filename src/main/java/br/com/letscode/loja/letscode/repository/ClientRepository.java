package br.com.letscode.loja.letscode.repository;

import br.com.letscode.loja.letscode.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
