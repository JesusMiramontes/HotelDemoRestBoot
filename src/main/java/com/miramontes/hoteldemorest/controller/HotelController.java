package com.miramontes.hoteldemorest.controller;

import com.miramontes.hoteldemorest.client.HotelClient;
import com.miramontes.hoteldemorest.client.generated.ResponseHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired HotelClient hotelClient;

    @GetMapping
    public ResponseHotel hello() {
        return hotelClient.getById(1);
    }
}
