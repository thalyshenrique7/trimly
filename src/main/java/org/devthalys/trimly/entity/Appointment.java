package org.devthalys.trimly.entity;

import java.util.Calendar;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Appointment extends PanacheEntity {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cut_type_id", referencedColumnName = "id")
	private CutType cutType;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "establishment_id", referencedColumnName = "id")
	private Establishment establishment;

	@ManyToOne
	@JoinColumn(name = "professional_id", referencedColumnName = "id")
	private Professional professional;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", nullable = false)
	private Calendar createdAt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", nullable = false)
	private Calendar updatedAt;

	public CutType getCutType() {
		return cutType;
	}

	public void setCutType(CutType cutType) {
		this.cutType = cutType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Professional getProfessional() {
		return professional;
	}

	public void setProfessional(Professional professional) {
		this.professional = professional;
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

	@PrePersist
	protected void onCreate() {

		if (createdAt == null)
			createdAt = Calendar.getInstance();

		updatedAt = Calendar.getInstance();
	}

	@PreUpdate
	protected void onUpdate() {

		updatedAt = Calendar.getInstance();

		if (createdAt == null)
			createdAt = updatedAt;
	}

}
