package org.devthalys.trimly.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.devthalys.trimly.utils.PanacheDTO;

public class EstablishmentDTO extends PanacheDTO {

	private AddressDTO address;

	private List<Long> cutTypeIds;
	private List<Long> professionalIds;

	private Calendar createdAt;
	private Calendar updatedAt;

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public List<Long> getCutTypeIds() {

		if (cutTypeIds == null)
			cutTypeIds = new ArrayList<Long>();

		return cutTypeIds;
	}

	public void setCutTypeIds(List<Long> cutTypeIds) {
		this.cutTypeIds = cutTypeIds;
	}

	public List<Long> getProfessionalIds() {

		if (professionalIds == null)
			professionalIds = new ArrayList<Long>();

		return professionalIds;
	}

	public void setProfessionalIds(List<Long> professionalIds) {
		this.professionalIds = professionalIds;
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
