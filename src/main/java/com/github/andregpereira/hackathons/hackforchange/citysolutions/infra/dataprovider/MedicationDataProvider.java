package com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.dataprovider;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.gateway.MedicationGateway;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.domain.model.Medication;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.mapper.MedicationDataProviderMapper;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.infra.repository.MedicationRepository;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@ApplicationScoped
public class MedicationDataProvider implements MedicationGateway {

    private final MedicationRepository repository;
    private final MedicationDataProviderMapper mapper;

    @Override
    public Uni<Medication> create(Medication medication) {
        return Panache.withTransaction(() -> repository.persist(mapper.toEntity(medication))).map(mapper::toModel);
    }

    @Override
    public Uni<Void> delete(Long id) {
        return Panache.withTransaction(() -> repository.deleteById(id)).replaceWithVoid();
    }

    @Override
    public Uni<Medication> findById(Long id) {
        return Panache.withSession(() -> repository.findById(id)).map(mapper::toModel);
    }

    @Override
    public Uni<List<Medication>> findAll() {
        return Panache.withSession(() -> repository.findAll().list().map(mapper::toModelList));
    }

}
