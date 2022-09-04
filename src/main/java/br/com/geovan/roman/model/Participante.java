package br.com.geovan.roman.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Participante {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<Custo> custos;
	@OneToMany(fetch=FetchType.EAGER)
	private Set<Pagamento> pagamentos;
	@ManyToMany(fetch=FetchType.EAGER)
	private Set<Role> roles;
}
