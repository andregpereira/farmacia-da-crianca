package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import io.smallrye.mutiny.Uni;

public interface MedicationFindByIdUc {

    Uni<Medication> findById(Long id);

}
