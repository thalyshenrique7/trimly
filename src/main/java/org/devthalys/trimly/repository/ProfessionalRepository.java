package org.devthalys.trimly.repository;

import org.devthalys.trimly.entity.Professional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProfessionalRepository implements PanacheRepository<Professional> {

}
