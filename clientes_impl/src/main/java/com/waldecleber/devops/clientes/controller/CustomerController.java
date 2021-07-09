package com.waldecleber.devops.clientes.controller;

import com.waldecleber.devops.clientes.domain.Cliente;
import com.waldecleber.devops.clientes.service.CustomerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class CustomerController {

    private final CustomerService customerService;

    @Value("${test.url}")
    private String url;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obterCliente(@PathVariable Integer id) {
        return ResponseEntity.ok().body(customerService.obterCliente(id));
    }

    @GetMapping
    public ResponseEntity<String> obterUrl() {
        return ResponseEntity.ok().body(this.url);
    }

}
