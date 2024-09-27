package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.EstablishmentDTO;
import org.devthalys.trimly.dto.EstablishmentDTODetails;

public interface EstablishmentService {

	void create(EstablishmentDTO dto);

	EstablishmentDTODetails getById(Long establishmentId);

	boolean validateEstablishmentExists(Long establishmentId);
}
