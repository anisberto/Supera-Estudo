package br.com.supera.controllers;

import br.com.supera.entities.Produto;
import br.com.supera.services.ProdutoService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoController {

    @Inject
    private ProdutoService produtoService;

    @GET
    public List<Produto> getAllProdutos(){
        return produtoService.listAll();
    }
}
