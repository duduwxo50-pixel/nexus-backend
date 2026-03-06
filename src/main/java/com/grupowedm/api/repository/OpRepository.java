package com.grupowedm.api.repository;

import com.grupowedm.api.entity.Op;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * Repositorio para la entidad Op.
 * Proporciona acceso a datos para la tabla correspondiente en la base de datos.
 */
@Repository
public interface OpRepository extends JpaRepository<Op, Long> {

    /**
     * Ejemplo de método personalizado para buscar por el campo 'numero'.
     * Spring generará la consulta automáticamente basándose en el nombre del método.
     * * @param numero El número de la operación a buscar
     * @return Un Optional que contiene la Op si se encuentra
     */
    Optional<Op> findByNumero(String numero);
}