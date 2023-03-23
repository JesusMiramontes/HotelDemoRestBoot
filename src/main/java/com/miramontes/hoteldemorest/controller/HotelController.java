package com.miramontes.hoteldemorest.controller;

import com.miramontes.hoteldemorest.client.HotelClient;
import com.miramontes.hoteldemorest.client.generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired HotelClient hotelClient;

    @GetMapping("/")
    public ResponseHotelList list() {
        return hotelClient.getAll();
    }

    @GetMapping("/{id}")
    public ResponseHotel byId(@PathVariable Integer id) {
        return hotelClient.getById(id);
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id) {
        return hotelClient.delete(id);
    }

    @PutMapping("/")
    public ResponseHotel update(@RequestBody Hotel hotel) {
        return hotelClient.update(hotel);
    }

    @PostMapping("/")
    public ResponseHotel create(@RequestBody CreateHotelRequest request) {
        return hotelClient.create(request);
    }
}
