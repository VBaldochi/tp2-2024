package com.baldochi.empresa;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigo;
    private Cliente cliente;
    private String tipoVenda;
    private List<ItemVenda> itensVenda;

    public Pedido(int codigo, Cliente cliente, String tipoVenda) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.tipoVenda = tipoVenda;
        this.itensVenda = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getTipoVenda() {
        return tipoVenda;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void adicionarItem(ItemVenda item) {
        itensVenda.add(item);
    }


    public int getQuantidadeTotalVendida() {
        int total = 0;
        for (ItemVenda item : itensVenda) {
            total += item.getQuantidade();
        }
        return total;
    }
}

//    public static Pedido gerarDadosPedido(List<Produto> produtos) {
//        // Implementar lógica para gerar dados aleatórios de um pedido com lista de itens variável
//        int numItens = (int) (Math.random() * 5) + 1;
//        List<ItemVenda> itens = new ArrayList<>();
//        for (int i = 0; i < numItens; i++) {
//            int quantidade = (int) (Math.random() * 10) + 1;
//            Produto produto = produtos.get((int) (Math.random() * produtos.size()));
//            itens.add(new ItemVenda(i, quantidade, produto));
//        }
//        return new Pedido(
//                (int) (Math.random() * 1000),
//                new Cliente((int) (Math.random() * 100), "Cliente " + (int) (Math.random