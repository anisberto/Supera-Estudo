package br.com.supera.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Frete {
	private Double preco;

	public Frete(Double preco) {
		this.preco = preco;
	}

}
