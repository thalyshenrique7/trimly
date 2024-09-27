package org.devthalys.trimly.dto;

import java.math.BigDecimal;

import org.devthalys.trimly.utils.PanacheDTO;

public class CutTypeDTO extends PanacheDTO {

	private String cutName;

	private BigDecimal cutValue;

	private Long establishmentId;

	public String getCutName() {
		return cutName;
	}

	public void setCutName(String cutName) {
		this.cutName = cutName;
	}

	public BigDecimal getCutValue() {
		return cutValue;
	}

	public void setCutValue(BigDecimal cutValue) {
		this.cutValue = cutValue;
	}

	public Long getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(Long establishmentId) {
		this.establishmentId = establishmentId;
	}

}
