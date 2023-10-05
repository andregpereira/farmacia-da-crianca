package com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.usecase.medication;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.gateway.MedicationGateway;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ApplicationScoped
public class MedicationDeleteUcImpl implements MedicationDeleteUc {

    private final MedicationGateway gateway;

    @Override
    public Uni<Void> delete(Long id) {
        return gateway.delete(id);
    }

}
