package com.github.andregpereira.hackathons.hackforchange.citysolutions.cross.exception;

import com.tietoevry.quarkus.resteasy.problem.HttpProblem;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.reactive.RestResponse;

import javax.annotation.concurrent.Immutable;
import java.text.MessageFormat;

@Immutable
public class MedicationNotFoundException extends HttpProblem {

    public static final Response.StatusType status = RestResponse.Status.NOT_FOUND;

    public MedicationNotFoundException(Long id) {
        super(builder().withStatus(status).withTitle("Medicamento não encontrado").withDetail(
                MessageFormat.format("Opa! Não foi encontrado um medicamento com id {0}", id)));
    }

}
