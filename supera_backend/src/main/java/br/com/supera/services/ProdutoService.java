package br.com.supera.services;

import br.com.supera.repositories.ProdutoRepository;
import lombok.experimental.Delegate;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProdutoService {
    @Inject
    @Delegate
    ProdutoRepository produtoRepository;
}
