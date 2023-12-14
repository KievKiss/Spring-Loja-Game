package com.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "O Atributo nome é obrigatório")
	@Size(max = 50, message = "O nome precisa ter no minimo 5 caracteres e no maximo 100" )
	@Column (length = 50)
	private String nome;
	
	@NotBlank(message = "O Atributo descrição é obrigatório")
	@Size(min = 5, max = 500, message = "A descrição precisa ter no minimo 5 caracteres e no maximo 500" )
	@Column (length = 500)
	private String descricao;
	
	@NotBlank(message = "O Atributo nome é obrigatório")
	@Size(max = 50, message = "O nome precisa ter no minimo 5 caracteres e no maximo 100" )
	@Column (length = 50)
	private String distribuidora;
		
	@NotNull
	private Float preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
	

	
}
