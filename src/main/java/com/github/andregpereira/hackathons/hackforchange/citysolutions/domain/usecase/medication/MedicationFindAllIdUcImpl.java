package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.gateway.MedicationGateway;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@ApplicationScoped
public class MedicationFindAllIdUcImpl implements MedicationFindAllIdUc {

    private final MedicationGateway gateway;

    @Override
    public Uni<List<Medication>> findAll() {
        return gateway.findAll();
    }

}
