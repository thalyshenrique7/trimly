package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.ProfessionalDTO;
import org.devthalys.trimly.dto.ProfessionalDTODetails;

public interface ProfessionalService {

	void create(ProfessionalDTO professionalDTO);

	ProfessionalDTODetails getById(Long professionalId);
}
