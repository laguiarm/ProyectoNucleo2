package com.edu.uelbosque.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.uelbosque.entity.Usuario;

public interface UsuarioPersistence extends JpaRepository<Usuario, Integer> {

}