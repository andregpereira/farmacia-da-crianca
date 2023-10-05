package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface MedicationFindAllIdUc {

    Uni<List<Medication>> findAll();

}
