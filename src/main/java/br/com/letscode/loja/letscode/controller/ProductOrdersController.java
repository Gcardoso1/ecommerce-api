package br.com.letscode.loja.letscode.controller;


import br.com.letscode.dto.ProductOrdersDTO;
import br.com.letscode.loja.letscode.service.ProductOrdersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/store-letscode")
public class ProductOrdersController {

    private final ProductOrdersService productOrdersService;

    public ResponseEntity<String> create(@RequestBody ProductOrdersDTO ordersDTO){
        productOrdersService.create(ordersDTO);
        return new ResponseEntity<String>("Order registered successfully", HttpStatus.OK);
    }
}
