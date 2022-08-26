package xyz.carlosarenas.persona.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.carlosarenas.persona.model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
