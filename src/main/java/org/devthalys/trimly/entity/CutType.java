package org.devthalys.trimly.entity;

import java.math.BigDecimal;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cut_type")
public class CutType extends PanacheEntity {

	@Column(name = "cut_name", nullable = false)
	private String cutName;

	@Column(name = "cut_value", nullable = false)
	private BigDecimal cutValue;

	@ManyToOne
	@JoinColumn(name = "establishment_id", referencedColumnName = "id")
	private Establishment establishment;

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
