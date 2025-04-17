package net.yallerco.openapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.yallerco.openapi.persistence.entity.PaisEntity;

public interface PaisRepository extends JpaRepository<PaisEntity, Long> {
}