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

    @GetMapping("/search")
    public ResponseHotelList search(@RequestParam String name) {
        return hotelClient.getAllByNameLike(name);
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

    @PutMapping("/updateAmenitiesById")
    public ResponseHotel updateAmenitiesById(
            @RequestBody UpdateAmenitiesHotelLinkByIdRequest request) {
        return hotelClient.updateAmenitiesById(request);
    }

    @PutMapping("/updateAmenitiesByName")
    public ResponseHotel updateAmenitiesByName(
            @RequestBody UpdateAmenitiesHotelLinkByNameRequest request) {
        return hotelClient.updateAmenitiesByName(request);
    }
}
