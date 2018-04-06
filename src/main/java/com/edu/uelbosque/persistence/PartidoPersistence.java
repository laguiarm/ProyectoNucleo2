package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Partido;

public interface PartidoPersistence extends JpaRepository<Partido, Integer> {

}