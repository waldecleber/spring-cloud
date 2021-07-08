package com.waldecleber.devops.clientes.service;

import com.waldecleber.devops.clientes.domain.Cliente;
import com.waldecleber.devops.clientes.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    public Cliente obterCliente(Integer idCustomer) {
        return listarClientes().stream()
                .filter(c -> c.getId().equals(idCustomer))
                .findAny()
                .orElseThrow(() -> new CustomerNotFoundException("Nenhum cliente encontrado!"));
    }

    public List<Cliente> listarClientes() {
        return Arrays.asList(
               Cliente.builder().id(1).nome("João").build(),
               Cliente.builder().id(2).nome("Maria").build()
        );
    }


}
