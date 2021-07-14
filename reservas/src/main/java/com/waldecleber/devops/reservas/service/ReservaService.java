package com.waldecleber.devops.reservas.service;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waldecleber.devops.clientes.dto.ClienteDTO;
import com.waldecleber.devops.reservas.clients.ClientesClient;
import com.waldecleber.devops.reservas.clients.HoteisClient;
import com.waldecleber.devops.reservas.domain.Hotel;
import com.waldecleber.devops.reservas.domain.Reserva;
import com.waldecleber.devops.reservas.exception.ClienteNotFoundException;
import com.waldecleber.devops.reservas.exception.HotelNotFoundException;

@Service
public class ReservaService {

    private ClientesClient clientesClient;
    private HoteisClient hoteisClient;

    @Autowired
    public ReservaService(ClientesClient clientesClient,
                             HoteisClient hoteisClient) {
        this.clientesClient = clientesClient;
        this.hoteisClient = hoteisClient;
    }

    public Optional<Reserva> realizarReserva(Integer idCliente, Integer idHotel) {
        ClienteDTO cliente = clientesClient.buscarCliente(idCliente)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente não encontrado"));
        Hotel hotel = hoteisClient.buscarHoteis(idHotel)
                .orElseThrow(() -> new HotelNotFoundException("Hotel não encontrado"));

        return Optional.of(Reserva.builder()
                .cliente(cliente)
                .hotel(hotel)
                .data(LocalDate.now())
                .build());
    }
}
