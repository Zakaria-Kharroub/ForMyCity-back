package com.example.city.service;

import com.example.city.domain.City;

import java.util.List;

public interface CityService {
    City save(City city);

    List<City> findAll();

    City findByName(String name);
}
