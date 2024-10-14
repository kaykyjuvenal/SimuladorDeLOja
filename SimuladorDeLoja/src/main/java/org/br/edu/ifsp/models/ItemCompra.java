package org.br.edu.ifsp.models;

public class ItemCompra implements IMostrarDados{
    private Produto produto;
    private int quantidadeComprada;
    private double valorCompra;

    public ItemCompra(Produto produto, int quantidadeComprada, double valorCompra) {
        this.produto = produto;
        this.quantidadeComprada = quantidadeComprada;
        this.valorCompra = valorCompra;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    @Override
    public void mostrarDados() {
        this.getProduto().mostrarDados();
        System.out.println("'\n'Quantidade comprada: " + this.getQuantidadeComprada() +
                        "'\n'Valor dsa compra: '" + this.getValorCompra());
    }
}
