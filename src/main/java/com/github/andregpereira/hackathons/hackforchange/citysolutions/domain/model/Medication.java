package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Medication {

    private Long id;
    private String name;
    private BigDecimal price;
    private String imageUrl;

}
