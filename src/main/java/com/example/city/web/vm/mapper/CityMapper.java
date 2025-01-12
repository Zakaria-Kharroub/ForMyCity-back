package com.example.city.web.vm.mapper;

import com.example.city.domain.City;
import com.example.city.dto.CityDTO;
import com.example.city.web.vm.CityVM;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {
    CityDTO toDTO(City city);
    City toEntity(CityVM cityVM);
}
