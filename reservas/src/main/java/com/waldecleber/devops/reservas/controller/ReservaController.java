package com.waldecleber.devops.reservas.controller;

import com.waldecleber.devops.reservas.domain.Reserva;
import com.waldecleber.devops.reservas.service.ReservaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/reservas")
public class ReservaController {

    private ReservaService reservaService;

    public ReservaController(ReservaService reservaService) {
        this.reservaService = reservaService;
    }

    @GetMapping("/{idCliente}/{idHotel}")
    public ResponseEntity<Reserva> realizarReserva(@PathVariable Integer idCliente,
                                                   @PathVariable Integer idHotel) {
        Optional<Reserva> reserva = reservaService.realizarReserva(idCliente, idHotel);
        if (reserva.isPresent()) {
            return ResponseEntity.ok().body(reserva.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
