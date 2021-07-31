package com.sebastian.pruebas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sebastian.pruebas.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
