package com.github.andregpereira.hackathons.hackforchange.citysolutions.app.service;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationCreateDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationDto;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface MedicationService {

    Uni<MedicationDto> create(MedicationCreateDto dto);

    Uni<MedicationDto> update(Long id, MedicationCreateDto dto);

    Uni<Void> delete(Long id);

    Uni<MedicationDto> findById(Long id);

    Uni<List<MedicationDto>> findAll();

}
