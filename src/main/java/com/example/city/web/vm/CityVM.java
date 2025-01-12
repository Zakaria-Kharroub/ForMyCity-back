package com.example.city.web.vm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class CityVM {
    @JsonProperty("name")
    private String name;

    @JsonProperty("region")
    private String region;

    @JsonProperty("country")
    private String country;


}