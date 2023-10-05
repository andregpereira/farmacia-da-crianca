package com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.mapper;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.entity.MedicationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.JAKARTA_CDI)
public interface MedicationDataProviderMapper {

    Medication toModel(MedicationEntity e);

    MedicationEntity toEntity(Medication m);

    default List<Medication> toModelList(List<MedicationEntity> m) {
        return m.stream().map(this::toModel).toList();
    }

}
