package com.baldochi.empresa;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String tipoVenda;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }

    private int codigo;
    private String cliente;
    private enum tipoVendaEnum {
        AAA,
        BBB,
        CCC
    };
    private List<ItemVenda> itensVenda;

    public static Pedido gerarPedido() {
        Pedido novoPedido = new Pedido();

        int idAleatorio = (int) (Math.random() * 100);

        novoPedido.setCliente("Cliente " + idAleatorio);
        novoPedido.setTipoVenda(String.valueOf(TipoVendaEnum.AAA));
        novoPedido.setCodigo(idAleatorio);

        List<ItemVenda> itensPedidos = new ArrayList<ItemVenda>();

        int quantidadeItens = (int) (Math.random() * 10);

        for (int i = 0; i < quantidadeItens; i++) {
            ItemVenda item = new ItemVenda();
            item.setCodigo(i);
            item.setQuantidadeVendida(i + 1);
            item.setProduto(Produto.gerarDadosProduto());
            itensPedidos.add(item);
        }
        novoPedido.setItensVenda(itensPedidos);
        return novoPedido;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getCliente() {
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