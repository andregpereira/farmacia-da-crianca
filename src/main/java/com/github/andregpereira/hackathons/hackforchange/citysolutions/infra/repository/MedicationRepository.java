package com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.repository;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.entity.MedicationEntity;
import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;

public interface MedicationRepository extends PanacheRepositoryBase<MedicationEntity, Long> {

}
