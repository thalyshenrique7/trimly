package org.devthalys.trimly.repository;

import org.devthalys.trimly.entity.Appointment;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AppointmentRepository implements PanacheRepository<Appointment> {

}
