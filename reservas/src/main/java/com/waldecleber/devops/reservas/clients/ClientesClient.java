package com.waldecleber.devops.reservas.clients;

import com.waldecleber.devops.reservas.domain.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "clientes-api", path = "clientes")
public interface ClientesClient {

    @GetMapping("/{id}")
    public Optional<Cliente> buscarCliente(@PathVariable Integer id);
}
