package br.com.letscode.loja.letscode.service;

import br.com.letscode.loja.letscode.domain.Client;
import br.com.letscode.loja.letscode.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public void create(Client client) {
        clientRepository.save(client);
    }
}
