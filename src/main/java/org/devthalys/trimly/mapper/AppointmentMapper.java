package org.devthalys.trimly.mapper;

import org.devthalys.trimly.dto.AppointmentDTO;
import org.devthalys.trimly.dto.AppointmentDTODetails;
import org.devthalys.trimly.entity.Appointment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface AppointmentMapper {

	Appointment toEntity(AppointmentDTO dto);

	AppointmentDTODetails toDTODetails(Appointment entity);
}