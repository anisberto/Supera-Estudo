package br.com.supera.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.entities.Produto;
import br.com.supera.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> getProduto() {
		return produtoService.getProduto();
	}

	@GetMapping("/nome/{nome}")
	public List<Produto> getProdutoByNome(@PathVariable String nome) {
		return produtoService.getPrdoutoByNome(nome);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Produto> getProdutoById(@PathVariable Long id) {
		if (produtoService.getProdutoById(id) != null) {
			return ResponseEntity.ok(produtoService.getProdutoById(id));
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Produto saveProduto(@Valid @RequestBody Produto produto) {
		return produtoService.saveProduto(produto);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Produto> updateProduto(@Valid @PathVariable Long id, @RequestBody Produto produto) {
		if (produtoService.getProdutoById(id) != null) {
			produto.setId(produtoService.getProdutoById(id).getId());
			produtoService.saveProduto(produto);
			return ResponseEntity.ok(produto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.PROCESSING)
	public ResponseEntity<Void> deleteProduto(@PathVariable Long id) {
		Produto produto = new Produto();
		if (produtoService.getProdutoById(id) != null) {
			produto.setId(produtoService.getProdutoById(id).getId());
			produtoService.deleteProduto(id);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}

	}
}
