package br.com.geovan.roman.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
public @Data class Custo {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String categoria;
	private BigDecimal quantidade;
	private BigDecimal valor;
	
	
}
