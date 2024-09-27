package org.devthalys.trimly.dto;

public class AppointmentDTODetails {

	private Long cutTypeId;
	private Long userId;
	private Long establishmentId;
	private Long professionalId;

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

}
