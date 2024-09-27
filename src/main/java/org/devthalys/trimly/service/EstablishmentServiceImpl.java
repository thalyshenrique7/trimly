package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.EstablishmentDTO;
import org.devthalys.trimly.dto.EstablishmentDTODetails;
import org.devthalys.trimly.entity.Establishment;
import org.devthalys.trimly.mapper.EstablishmentMapper;
import org.devthalys.trimly.repository.EstablishmentRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EstablishmentServiceImpl implements EstablishmentService {

	@Inject
	private EstablishmentRepository establishmentRepository;

	@Inject
	private EstablishmentMapper establishmentMapper;

	@Override
	public void create(EstablishmentDTO dto) {

		Establishment establishment = this.establishmentMapper.toEntity(dto);

		this.establishmentRepository.persist(establishment);
	}

	@Override
	public EstablishmentDTODetails getById(Long establishmentId) {

		Establishment establishment = this.establishmentRepository.findById(establishmentId);

		EstablishmentDTODetails dto = this.establishmentMapper.toDTODetails(establishment);

		return dto;
	}

	@Override
	public boolean validateEstablishmentExists(Long establishmentId) {
		return this.establishmentRepository.findById(establishmentId) != null;
	}

}
