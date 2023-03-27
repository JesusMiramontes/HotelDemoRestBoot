package com.miramontes.hoteldemorest.config;

import com.miramontes.hoteldemorest.client.AmenityClient;
import com.miramontes.hoteldemorest.client.HotelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class HotelClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.miramontes.hoteldemorest.client.generated");
        return marshaller;
    }

    @Bean
    public HotelClient hotelClient(Jaxb2Marshaller marshaller) {
        HotelClient client = new HotelClient();
        client.setDefaultUri("http://localhost:8081/service/hotels");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public AmenityClient amenityClient(Jaxb2Marshaller marshaller) {
        AmenityClient client = new AmenityClient();
        client.setDefaultUri("http://localhost:8081/service/hotels");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
