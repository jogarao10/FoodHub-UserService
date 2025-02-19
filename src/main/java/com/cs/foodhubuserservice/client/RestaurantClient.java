package com.cs.foodhubuserservice.client;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestaurantClient {

    private RestTemplate restTemplate = new RestTemplate();

    public String getRestaurantDetails(Long restaurantId) {
        String url = "http://localhost:7071/restaurants/" + restaurantId;
        return restTemplate.getForObject(url, String.class);
    }
}

