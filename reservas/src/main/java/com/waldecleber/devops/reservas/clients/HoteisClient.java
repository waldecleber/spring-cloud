package com.waldecleber.devops.reservas.clients;

import com.waldecleber.devops.reservas.domain.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(value = "hoteis-api", path = "hoteis")
public interface HoteisClient {

    @GetMapping("/{id}")
    public Optional<Hotel> buscarHoteis(@PathVariable Integer id);
}
