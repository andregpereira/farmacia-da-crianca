package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import io.smallrye.mutiny.Uni;

public interface MedicationDeleteUc {

    Uni<Void> delete(Long id);

}
