package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Equipo;

public interface EquipoPersistence extends JpaRepository<Equipo, Integer> {
	
}