package com.waldecleber.devops.service;

import com.waldecleber.devops.domain.Hotel;
import com.waldecleber.devops.exceptions.HotelNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HotelService {

    public Hotel buscarHotel(Integer id) {
        return buscarHoteis().stream()
                .filter(h -> h.getId().equals(id))
                .findAny().orElseThrow(() -> new HotelNotFoundException("Hotel não encontrado"));
    }

    private List<Hotel> buscarHoteis() {
        return Arrays.asList(
                Hotel.builder().id(1).nome("Internacional").build(),
                Hotel.builder().id(2).nome("Business Tower").build()
        );
    }
}
