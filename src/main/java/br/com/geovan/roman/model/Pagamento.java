package br.com.geovan.roman.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public @Data class Pagamento {

	@Id
	@GeneratedValue
	private Long id;
	private BigDecimal valor;
	@ManyToOne
	private Participante participante;
	
}
