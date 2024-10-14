package org.br.edu.ifsp.models;

import java.util.List;

public class Compra implements IMostrarDados{
    private List<ItemCompra> itensDeCompra;
    private String numeroCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;

    public Compra(List<ItemCompra> itensDeCompra, String numeroCompra) {
        this.itensDeCompra = itensDeCompra;
        this.numeroCompra = numeroCompra;
        this.calcularValorTotalCompra();
    }

    public List<ItemCompra> getItensDeCompra() {
        return itensDeCompra;
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
        if (valorTotal >= 5000){
            this.setValorDesconto(0.10 * valorTotal);
            this.setValorPagar(0.10 * valorTotal + valorTotal);
        }
        else{
            this.setValorDesconto(0);
            this.setValorPagar(valorTotal);
        }
    }

    public void mostrarItensDaLista(){
        if (!this.getItensDeCompra().isEmpty()) {
            for (ItemCompra item : itensDeCompra) {
                item.mostrarDados();
            }
        }else
            System.out.println("Não tem itens na lista!");

    }

    @Override
    public void mostrarDados() {
        this.mostrarItensDaLista();
        System.out.println(
                "\nNumero da compra: " + this.getNumeroCompra()+ '\'' +
                "\nValor total da compra: " + this.getValorTotalCompra() +
                "\nValor de desconto=" + this.getValorDesconto() +
                "\nValor à ser pago: " + this.getValorPagar());
    }
}
