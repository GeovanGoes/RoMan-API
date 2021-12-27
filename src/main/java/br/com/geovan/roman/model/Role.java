package br.com.geovan.roman.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Role {

	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String local;
	private LocalDateTime data;
	@OneToMany
	private Set<Custo> custos;
	@ManyToMany
	private Set<Particpante> participantes;
	
	private String status;
}
