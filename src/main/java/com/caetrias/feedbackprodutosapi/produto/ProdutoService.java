package com.caetrias.feedbackprodutosapi.produto;

import java.util.List;

public interface ProdutoService {

    public void registrarProduto(Produto produto);
    public void atualizarProduto(Produto produto);
    public void excluirProduto(Produto produto);

    public List<Produto> listarProdutos();
    public Produto buscarProdutoPorId(int id);

    public Double calcularMediaAvaliacoes();
}
