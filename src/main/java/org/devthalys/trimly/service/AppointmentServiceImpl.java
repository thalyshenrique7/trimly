package org.devthalys.trimly.service;

import org.devthalys.trimly.dto.AppointmentDTO;
import org.devthalys.trimly.dto.AppointmentDTODetails;
import org.devthalys.trimly.entity.Appointment;
import org.devthalys.trimly.mapper.AppointmentMapper;
import org.devthalys.trimly.repository.AppointmentRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AppointmentServiceImpl implements AppointmentService {

	@Inject
	private AppointmentRepository appointmentRepository;

	@Inject
	private AppointmentMapper appointmentMapper;

	@Override
	public void create(AppointmentDTO dto) {

		Appointment appointment = this.appointmentMapper.toEntity(dto);

		this.appointmentRepository.persist(appointment);
	}

	@Override
	public void delete(Long appointmentId) {

		this.appointmentRepository.deleteById(appointmentId);
	}

	@Override
	public AppointmentDTODetails getById(Long appointmentId) {

		Appointment appointment = this.appointmentRepository.findById(appointmentId);

		AppointmentDTODetails dto = this.appointmentMapper.toDTODetails(appointment);

		return dto;
	}

}
