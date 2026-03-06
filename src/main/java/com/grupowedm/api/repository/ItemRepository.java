package com.grupowedm.api.repository;

import com.grupowedm.api.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Item.
 * Extiende JpaRepository para obtener automáticamente métodos CRUD:
 * save(), findAll(), findById(), deleteById(), etc.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    // Aquí puedes añadir métodos de búsqueda personalizados si los necesitas en el futuro
    // Ejemplo: List<Item> findByNombreContaining(String nombre);
}