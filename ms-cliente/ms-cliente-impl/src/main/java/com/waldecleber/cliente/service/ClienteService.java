package com.waldecleber.cliente.service;

import com.waldecleber.cliente.domain.Cliente;
import com.waldecleber.cliente.exception.ClienteNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClienteService {

    public Cliente obterCliente(Integer idCustomer) {
        return listarClientes().stream()
                .filter(c -> c.getId().equals(idCustomer))
                .findAny()
                .orElseThrow(() -> new ClienteNotFoundException("Nenhum cliente encontrado!"));
    }

    public List<Cliente> listarClientes() {
        return Arrays.asList(
               Cliente.builder().id(1).nome("João").build(),
               Cliente.builder().id(2).nome("Maria").build()
        );
    }


}
