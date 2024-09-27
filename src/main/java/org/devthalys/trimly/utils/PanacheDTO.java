package org.devthalys.trimly.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PanacheDTO {

	private Long id;

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	public String toJson() throws Exception {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(this);
	}
}
