package com.github.andregpereira.hackathons.hackforchange.citysolutions.app.service;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationCreateDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.mapper.MedicationServiceMapper;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication.*;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@ApplicationScoped
public class MedicationServiceImpl implements MedicationService {

    private final MedicationCreateUc createUc;
    private final MedicationUpdateUc updateUc;
    private final MedicationDeleteUc deleteUc;
    private final MedicationFindByIdUc findByIdUc;
    private final MedicationFindAllIdUc findAllIdUc;
    private final MedicationServiceMapper mapper;

    @Override
    public Uni<MedicationDto> create(MedicationCreateDto dto) {
        return createUc.create(mapper.toModel(dto)).map(mapper::toDto);
    }

    @Override
    public Uni<MedicationDto> update(Long id, MedicationCreateDto dto) {
        return updateUc.update(id, mapper.toModel(dto)).map(mapper::toDto);
    }

    @Override
    public Uni<Void> delete(Long id) {
        return deleteUc.delete(id);
    }

    @Override
    public Uni<MedicationDto> findById(Long id) {
        return findByIdUc.findById(id).map(mapper::toDto);
    }

    @Override
    public Uni<List<MedicationDto>> findAll() {
        return findAllIdUc.findAll().map(mapper::toDtoList);
    }

}
