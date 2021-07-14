package com.waldecleber.devops.controller;

import com.waldecleber.devops.domain.Hotel;
import com.waldecleber.devops.service.HotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoteis")
public class HoteisController {

    public HotelService hotelService;

    public HoteisController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Hotel> buscarHotelPorId(@PathVariable Integer id) {
        return ResponseEntity.ok().body(hotelService.buscarHotel(id));
    }

}
