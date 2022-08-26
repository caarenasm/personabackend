package xyz.carlosarenas.persona.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.carlosarenas.persona.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {

}
