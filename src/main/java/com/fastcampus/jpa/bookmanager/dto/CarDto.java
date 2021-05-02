package com.fastcampus.jpa.bookmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CarDto {
    private String name;

    @JsonProperty(value = "car_number")
    private String carNumber;
}
