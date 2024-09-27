package org.devthalys.trimly.controller;

import org.devthalys.trimly.dto.EstablishmentDTO;
import org.devthalys.trimly.dto.EstablishmentDTODetails;
import org.devthalys.trimly.service.EstablishmentService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/api/establishment")
public class EstablishmentController {

	@Inject
	private EstablishmentService establishmentService;

	@GET
	@Path(value = "/{id}")
	public EstablishmentDTODetails findById(@PathParam("id") Long id) {
		return this.establishmentService.getById(id);
	}

	@Transactional
	@POST
	public void save(EstablishmentDTO establishmentDTO) {
		this.establishmentService.create(establishmentDTO);
	}
}
