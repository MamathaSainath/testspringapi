package com.galvanize.restaurants;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RestaurantsController {
    @Autowired
     private RestaurantService service;

    @PostMapping("api/restaurants")
    public Restaurant addRestaurant(Restaurant rest){
        Restaurant add = service.addRestaurant(rest);
        return add;
    }

    @GetMapping("api/restaurants")
    public List<Restaurant> getRestaurants(){
        return  service.getRestaurantsList();
    }





}
