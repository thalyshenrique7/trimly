package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.ProfessionalDTO;
import org.devthalys.trimly.dto.ProfessionalDTODetails;
import org.devthalys.trimly.entity.Professional;
import org.devthalys.trimly.mapper.ProfessionalMapper;
import org.devthalys.trimly.repository.ProfessionalRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfessionalServiceImpl implements ProfessionalService {

	@Inject
	private ProfessionalRepository professionalRepository;

	@Inject
	private ProfessionalMapper professionalMapper;

	@Inject
	private EstablishmentService establishmentService;

	@Override
	public void create(ProfessionalDTO professionalDTO) {

		if (!this.establishmentService.validateEstablishmentExists(professionalDTO.getEstablishmentId()))
			throw new RuntimeException("Establishment cannot be find by ID " + professionalDTO.getEstablishmentId()
					+ ", verify if establishment was created");

		Professional professional = this.professionalMapper.toEntity(professionalDTO);

		this.professionalRepository.persist(professional);
	}

	@Override
	public ProfessionalDTODetails getById(Long professionalId) {

		Professional professional = this.professionalRepository.findById(professionalId);

		ProfessionalDTODetails dto = this.professionalMapper.toDTODetails(professional);

		return dto;
	}

}
