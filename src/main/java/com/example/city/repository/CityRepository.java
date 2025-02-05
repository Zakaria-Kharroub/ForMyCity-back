package com.example.city.repository;

import com.example.city.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CityRepository extends JpaRepository<City, UUID> {

    City findByName(String name);
}
