package com.example.city.repository;

import com.example.city.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CityRepository extends JpaRepository<City, String> {

}
