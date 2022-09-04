package br.com.geovan.roman.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
public @Data class Role {

	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String local;
	private LocalDateTime data;
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Custo> custos;
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<Participante> participantes;
	
	private String status;
}
