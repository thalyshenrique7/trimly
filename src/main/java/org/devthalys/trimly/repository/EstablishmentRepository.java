package org.devthalys.trimly.repository;

import org.devthalys.trimly.entity.Establishment;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EstablishmentRepository implements PanacheRepository<Establishment> {

}
