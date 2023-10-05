package com.github.andregpereira.hackathons.hackforchange.citysolutions.app.resource;

import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationCreateDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.dto.medicamento.MedicationDto;
import com.github.andregpereira.hackathons.hackforchange.citysolutions.app.service.MedicationService;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import lombok.RequiredArgsConstructor;
import org.jboss.resteasy.reactive.RestPath;

import java.net.URI;

@RequiredArgsConstructor
@Path("/medicamentos")
public class MedicationResource {

    private final MedicationService service;
    private final UriInfo uriInfo;

    private URI getUri(MedicationDto id) {
        return uriInfo.getAbsolutePathBuilder().path("{id}").build(id);
    }

    @POST
    public Uni<Response> create(MedicationCreateDto dto) {
        return service.create(dto).map(m -> Response.created(getUri(m)).entity(m).build());
    }

    @PUT
    @Path("/{id}")
    public Uni<Response> update(@RestPath Long id, MedicationCreateDto dto) {
        return service.update(id, dto).map(Response::ok).map(Response.ResponseBuilder::build);
    }

    @DELETE
    @Path("/{id}")
    public Uni<Response> delete(@RestPath Long id) {
        return service.delete(id).map(Response::ok).map(Response.ResponseBuilder::build);
    }

    @GET
    @Path("/{id}")
    public Uni<Response> findById(@RestPath Long id) {
        return service.findById(id).map(Response::ok).map(Response.ResponseBuilder::build);
    }

    @GET
    public Uni<Response> findAll() {
        return service.findAll().map(Response::ok).map(Response.ResponseBuilder::build);
    }

}
