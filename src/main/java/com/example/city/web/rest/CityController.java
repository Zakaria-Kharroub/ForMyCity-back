package com.example.city.web.rest;

import com.example.city.domain.City;
import com.example.city.dto.CityDTO;
import com.example.city.service.CityService;
import com.example.city.web.vm.CityVM;
import com.example.city.web.vm.mapper.CityMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {
    private final CityService cityService;
    private CityMapper cityMapper;

    public CityController(CityService cityService, CityMapper cityMapper) {
        this.cityService = cityService;
        this.cityMapper = cityMapper;
    }

    @PostMapping("/save")
    public ResponseEntity<CityDTO> save(@RequestBody CityVM cityVM){
        City city = cityMapper.toEntity(cityVM);
        City savedCity = cityService.save(city);
        CityDTO cityDTO = cityMapper.toDTO(savedCity);
        return new ResponseEntity<>(cityDTO, HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<CityDTO>> findAll(){
        List<City> cities = cityService.findAll();
        List<CityDTO> cityDTOS = cities.stream()
                .map(cityMapper::toDTO)
                .collect(Collectors.toList());
        return new ResponseEntity<>(cityDTOS,HttpStatus.OK);
    }


}
