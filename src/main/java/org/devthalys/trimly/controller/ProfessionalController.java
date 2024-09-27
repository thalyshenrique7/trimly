package org.devthalys.trimly.controller;

import org.devthalys.trimly.dto.ProfessionalDTO;
import org.devthalys.trimly.dto.ProfessionalDTODetails;
import org.devthalys.trimly.service.ProfessionalService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/api/professional")
public class ProfessionalController {

	@Inject
	private ProfessionalService professionalService;

	@GET
	@Path(value = "/{id}")
	public ProfessionalDTODetails findById(@PathParam("id") Long id) {
		return this.professionalService.getById(id);
	}

	@Transactional
	@POST
	public void save(ProfessionalDTO professionalDTO) {
		this.professionalService.create(professionalDTO);
	}
}
