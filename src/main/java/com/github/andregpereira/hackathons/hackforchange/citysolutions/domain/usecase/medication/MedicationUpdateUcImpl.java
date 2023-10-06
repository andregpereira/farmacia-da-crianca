package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.gateway.MedicationGateway;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ApplicationScoped
public class MedicationUpdateUcImpl implements MedicationUpdateUc {

    private final MedicationGateway gateway;

    @Override
    public Uni<Medication> update(Long id, Medication medication) {
        return gateway.update(id, medication);
    }

}
