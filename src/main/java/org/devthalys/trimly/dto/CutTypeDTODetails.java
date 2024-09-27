package org.devthalys.trimly.dto;

import java.math.BigDecimal;

public class CutTypeDTODetails {

	private String cutName;

	private BigDecimal cutValue;

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

}
