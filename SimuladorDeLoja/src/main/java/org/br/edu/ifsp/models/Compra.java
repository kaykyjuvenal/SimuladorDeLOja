package org.br.edu.ifsp.models;

import java.util.List;

public class Compra implements IMostrarDados{
    private List<ItemCompra> itensDeCompra;
    private String numeroCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;

    public List<ItemCompra> getItensDeCompra() {
        return itensDeCompra;
    }

    public void setItensDeCompra(List<ItemCompra> itensDeCompra) {
        this.itensDeCompra = itensDeCompra;
    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    public void addListaItensDeCompra(ItemCompra itemCompra){
        this.itensDeCompra.add(itemCompra);
    }
    public void removeListaItensDeCompra(ItemCompra itemCompra){
        this.itensDeCompra.remove(itemCompra);
    }
    public void removeListaItensDeCompra(int index){
        this.itensDeCompra.remove(index);
    }
    public void calcularValorTotalCompra() {
        double valorTotal = 0;

        List<ItemCompra> itensDeCompra = this.getItensDeCompra();
        if (!itensDeCompra.isEmpty()) {
            for (ItemCompra item : itensDeCompra) {
                valorTotal += (item.getValorCompra() * item.getQuantidadeComprada());
            }
        }
        this.setValorTotalCompra(valorTotal);
    }


    @Override
    public void mostrarDados() {

    }
}
