package com.miramontes.hoteldemorest.controller;

import com.miramontes.hoteldemorest.client.AmenityClient;
import com.miramontes.hoteldemorest.client.generated.ResponseAmenitiesList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amenities")
public class AmenityController {
    @Autowired AmenityClient client;

    @GetMapping("/")
    public ResponseAmenitiesList list() {
        return client.getAmenitiesList();
    }
}
