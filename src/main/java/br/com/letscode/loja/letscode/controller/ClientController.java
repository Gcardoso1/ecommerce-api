package br.com.letscode.loja.letscode.controller;

import br.com.letscode.loja.letscode.service.ClientService;
import br.com.letscode.lojaletscode.domain.Client;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-letscode")
public class ClientController {

    private final ClientService clientService;

    @PostMapping("/register-customer")
    public ResponseEntity<String> create(@RequestBody Client client){
        clientService.create(client);
        return new ResponseEntity<>("Client registered successfully", HttpStatus.OK);
    }
}
