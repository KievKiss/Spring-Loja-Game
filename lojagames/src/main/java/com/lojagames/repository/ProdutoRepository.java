package com.lojagames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {

}
