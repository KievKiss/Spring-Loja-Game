package com.lojagames.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo nome é obrigatório")
	@Size(max = 50, message = "O nome precisa ter no minimo 5 caracteres e no maximo 100" )
	@Column (length = 50)
	private String nome;
	
	@NotBlank(message = "O Atributo descrição é obrigatório")
	@Size(min = 5, max = 500, message = "A descrição precisa ter no minimo 5 caracteres e no maximo 500" )
	@Column (length = 500)
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
