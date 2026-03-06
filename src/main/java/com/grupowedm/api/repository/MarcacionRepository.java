package com.grupowedm.api.repository;

import com.grupowedm.api.entity.Marcacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcacionRepository extends JpaRepository<Marcacion, Long> {
}