package com.baldochi.lista2ex1;

public class Estoque {

    private Produto[] produtos;

    public Estoque() {
        produtos = new Produto[30];
    }

    public void cadastrarProduto(int codigo, int quantidade, double valorCompra, double valorVenda) {
        produtos[codigo] = new Produto(codigo, quantidade, valorCompra, valorVenda);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            if (produto != null) {
                produto.exibirInformacoes();
            }
        }
    }

    public void listarProdutoPorCodigo(int codigo) {
        Produto produto = buscarProdutoPorCodigo(codigo);

        if (produto != null) {
            produto.exibirInformacoes();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
