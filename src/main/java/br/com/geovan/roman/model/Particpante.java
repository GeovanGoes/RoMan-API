package br.com.geovan.roman.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public @Data class Particpante {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@ManyToMany
	private Set<Custo> custos;
	@OneToMany
	private Set<Pagamento> pagamentos;
	@ManyToMany
	private Set<Role> roles;
}
