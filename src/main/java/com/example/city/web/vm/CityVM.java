package com.example.city.web.vm;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;


@Data
public class CityVM {
@NotEmpty(message = "Name must not be empty")
@NotNull(message = "Name must not be null")
private String name;

@NotEmpty(message = "Region must not be empty")
@NotNull(message = "Region must not be null")
private String region;

@NotEmpty(message = "Country must not be empty")
@NotNull(message = "Country must not be null")
private String country;
}