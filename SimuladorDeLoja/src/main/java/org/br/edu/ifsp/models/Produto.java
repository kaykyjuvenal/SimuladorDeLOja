package org.br.edu.ifsp.models;

public abstract class Produto {
    public String descricao;
    public double precoUnitario;

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

}
