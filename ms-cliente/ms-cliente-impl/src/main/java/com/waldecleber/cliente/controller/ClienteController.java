package com.waldecleber.cliente.controller;

import com.waldecleber.cliente.domain.Cliente;
import com.waldecleber.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Value("${test.url}")
    private String url;

    public ClienteController(ClienteService customerService) {
        this.clienteService = customerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obterCliente(@PathVariable Integer id) {
        return ResponseEntity.ok().body(clienteService.obterCliente(id));
    }

    @GetMapping
    public ResponseEntity<String> obterUrl() {
        return ResponseEntity.ok().body(this.url);
    }

}
