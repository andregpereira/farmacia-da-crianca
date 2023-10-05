package com.github.andregpereira.hackathons.hackforchange.citysolutions.app.mapper;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationCreateDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface MedicationServiceMapper {

    Medication toModel(MedicationCreateDto dto);

    MedicationDto toDto(Medication m);

    default List<MedicationDto> toDtoList(List<Medication> m) {
        return m.stream().map(this::toDto).toList();
    }

}
