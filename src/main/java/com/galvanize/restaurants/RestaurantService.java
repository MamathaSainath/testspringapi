package com.galvanize.restaurants;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    List<Restaurant> restaurantsList = new ArrayList<>();
    private static int counter = 0;

    public Restaurant addRestaurant(Restaurant rest) {
        rest.setId(++counter);
        restaurantsList.add(rest);
        return rest;
    }

    public List<Restaurant> getRestaurantsList() {
        return restaurantsList;
    }

    public Restaurant editRestaurant(Restaurant rest){
        restaurantsList.add(rest.getId(), rest);
        return  rest;
    }

}
