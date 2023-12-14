package com.lojagames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
