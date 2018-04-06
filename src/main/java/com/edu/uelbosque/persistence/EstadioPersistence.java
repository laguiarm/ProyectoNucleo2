package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Estadio;

public interface EstadioPersistence extends JpaRepository<Estadio, Integer> {

}