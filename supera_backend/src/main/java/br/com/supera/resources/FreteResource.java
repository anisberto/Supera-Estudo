package br.com.supera.resources;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.entities.Frete;
import br.com.supera.entities.Produto;

@RestController
@RequestMapping("/frete")
public class FreteResource {

	@PostMapping
	public Frete calcularFrete(@RequestBody List<Produto> produtos) {
		Double valorTotal = 0.0;
		for (int i = 0; i < produtos.size(); i++) {
			valorTotal += produtos.get(i).getPrice();
		}
		if (valorTotal >= 250.00) {
			return new Frete(0.0);
		} else {
			return new Frete(valorTotal);
		}
	}
}
