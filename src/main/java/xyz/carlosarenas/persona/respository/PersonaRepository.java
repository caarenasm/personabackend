package xyz.carlosarenas.persona.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.carlosarenas.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
