package com.baldochi.empresa;

public class Teste {

//    public static void main(String[] args) {
//        System.out.println(Produto.gerarDadosProduto());
//    }

    public static void main(String[] args) {

        Pedido p = Pedido.gerarPedido();

        System.out.println(p.getCliente());
        System.out.println(p.getCodigo());
        System.out.println(p.getTipoVenda());

        System.out.println("##### Itens Pedidos #####");
        p.getItensVenda().forEach(itemVenda -> System.out.printf("\n%d %d, %s", itemVenda.getCodigo(),
                itemVenda.getQuantidade(), itemVenda.getProduto().toString()));
    }
}
