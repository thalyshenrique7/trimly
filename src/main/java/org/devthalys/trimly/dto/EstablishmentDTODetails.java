package org.devthalys.trimly.dto;

import java.util.ArrayList;
import java.util.List;

public class EstablishmentDTODetails {

	private AddressDTO address;

	private List<Long> cutTypeIds;
	private List<Long> professionalIds;

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

}
