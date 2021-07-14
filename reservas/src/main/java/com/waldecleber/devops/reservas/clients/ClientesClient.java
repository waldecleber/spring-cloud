package com.waldecleber.devops.reservas.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "clientes-api", path = "clientes")
public interface ClientesClient {

    @GetMapping("/{id}")
    public Optional<ClienteDTO> buscarCliente(@PathVariable Integer id);
}
