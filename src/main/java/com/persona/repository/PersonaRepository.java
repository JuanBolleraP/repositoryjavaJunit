package com.persona.repository;

import org.springframework.data.repository.CrudRepository;

import com.persona.modelo.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
	//CRUD: CRUD REPOSITORY YA ESTAN IMPLEMENTADAS LAS CONSULTAS.
}
