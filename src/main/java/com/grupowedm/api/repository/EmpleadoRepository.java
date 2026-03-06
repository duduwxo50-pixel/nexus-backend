package com.grupowedm.api.repository;

import com.grupowedm.api.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Al extender JpaRepository, ya tienes findAll, save, delete, etc.
}
