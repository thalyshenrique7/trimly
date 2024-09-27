package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.CutTypeDTO;
import org.devthalys.trimly.dto.CutTypeDTODetails;

public interface CutTypeService {

	void create(CutTypeDTO dto);

	void delete(Long id);

	CutTypeDTODetails getById(Long id);
}
