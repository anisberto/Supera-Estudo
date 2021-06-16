package br.com.supera.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.supera.entities.Produto;
import br.com.supera.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Transactional
	public List<Produto> getProduto() {
		return produtoRepository.findAll();
	}

	@Transactional
	public List<Produto> getPrdoutoByNome(String nome) {
		return produtoRepository.findByNameContaining(nome);
	}

	@Transactional
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).get();
	}

	@Transactional
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Transactional
	public Produto updateProduto(Long id, Produto produto) {
		produto.setId(produtoRepository.findById(id).get().getId());
		produtoRepository.save(produto);
		return produto;
	}

	@Transactional
	public void deleteProduto(Long id) {
		Produto produto = new Produto();
		produto.setId(produtoRepository.findById(id).get().getId());
		produtoRepository.delete(produto);
	}
}
