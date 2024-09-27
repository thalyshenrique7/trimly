package org.devthalys.trimly.controller;

import org.devthalys.trimly.dto.CutTypeDTO;
import org.devthalys.trimly.dto.CutTypeDTODetails;
import org.devthalys.trimly.service.CutTypeService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/api/cut-type")
public class CutTypeController {

	@Inject
	private CutTypeService cutTypeService;

	@GET
	@Path(value = "/{id}")
	public CutTypeDTODetails findById(@PathParam("id") Long id) {
		return this.cutTypeService.getById(id);
	}

	@Transactional
	@POST
	public void save(CutTypeDTO cutTypeDTO) {
		this.cutTypeService.create(cutTypeDTO);
	}
}
