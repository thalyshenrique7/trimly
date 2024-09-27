package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.AppointmentDTO;
import org.devthalys.trimly.dto.AppointmentDTODetails;

public interface AppointmentService {

	void create(AppointmentDTO dto);

	void delete(Long appointmentId);

	AppointmentDTODetails getById(Long appointmentId);
}
