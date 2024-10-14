package org.br.edu.ifsp.models;

public abstract class Produto implements IMostrarDados{
    private String descricao;
    private double precoUnitario;

    public Produto(String descricao, double precoUnitario) {
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }



    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void mostrarDados() {
        System.out.println("Descricao: " + this.getDescricao() +
                           "Preço " + this.getPrecoUnitario());
    }

}
