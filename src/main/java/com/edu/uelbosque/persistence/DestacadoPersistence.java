package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Destacado;

public interface DestacadoPersistence extends JpaRepository<Destacado, Integer> {

}