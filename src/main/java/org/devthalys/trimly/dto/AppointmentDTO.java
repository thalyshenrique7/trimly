package org.devthalys.trimly.dto;

import java.util.Calendar;

import org.devthalys.trimly.utils.PanacheDTO;

public class AppointmentDTO extends PanacheDTO {

	private Long cutTypeId;
	private Long userId;
	private Long establishmentId;
	private Long professionalId;

	private Calendar createdAt;
	private Calendar updatedAt;

	public Long getCutTypeId() {
		return cutTypeId;
	}

	public void setCutTypeId(Long cutTypeId) {
		this.cutTypeId = cutTypeId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(Long establishmentId) {
		this.establishmentId = establishmentId;
	}

	public Long getProfessionalId() {
		return professionalId;
	}

	public void setProfessionalId(Long professionalId) {
		this.professionalId = professionalId;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public Calendar getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Calendar updatedAt) {
		this.updatedAt = updatedAt;
	}

}
