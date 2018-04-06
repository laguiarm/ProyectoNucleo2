package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Posicion;

public interface PosicionPersistence extends JpaRepository<Posicion, Integer> {

}