package com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento;

import java.math.BigDecimal;

public record MedicationCreateDto(String name,
        BigDecimal price,
        String imageUrl) {

}
