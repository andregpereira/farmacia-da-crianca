package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.gateway;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface MedicationGateway {

    Uni<Medication> create(Medication medication);

    Uni<Medication> update(Long id, Medication medication);

    Uni<Void> delete(Long id);

    Uni<Medication> findById(Long id);

    Uni<List<Medication>> findAll();

}
