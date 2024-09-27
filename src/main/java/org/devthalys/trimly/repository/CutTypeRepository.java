package org.devthalys.trimly.repository;

import org.devthalys.trimly.entity.CutType;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CutTypeRepository implements PanacheRepository<CutType> {

}
