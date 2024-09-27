package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.CutTypeDTO;
import org.devthalys.trimly.dto.CutTypeDTODetails;
import org.devthalys.trimly.entity.CutType;
import org.devthalys.trimly.mapper.CutTypeMapper;
import org.devthalys.trimly.repository.CutTypeRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CutTypeServiceImpl implements CutTypeService {

	@Inject
	private CutTypeRepository cutTypeRepository;

	@Inject
	private CutTypeMapper cutTypeMapper;

	@Inject
	private EstablishmentService establishmentService;

	@Override
	public void create(CutTypeDTO dto) {

		if (!this.establishmentService.validateEstablishmentExists(dto.getEstablishmentId()))
			throw new RuntimeException("Establishment cannot be find by ID " + dto.getEstablishmentId()
					+ ", verify if establishment was created");

		CutType cutType = this.cutTypeMapper.toEntity(dto);

		this.cutTypeRepository.persist(cutType);
	}

	@Override
	public void delete(Long id) {
		this.cutTypeRepository.deleteById(id);
	}

	@Override
	public CutTypeDTODetails getById(Long id) {

		CutType cutType = this.cutTypeRepository.findById(id);

		CutTypeDTODetails dto = this.cutTypeMapper.toDTODetails(cutType);

		return dto;
	}

}
