package com.miramontes.hoteldemorest.controller;

import com.miramontes.hoteldemorest.client.HotelClient;
import com.miramontes.hoteldemorest.client.generated.ResponseHotel;
import com.miramontes.hoteldemorest.client.generated.ResponseHotelList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
