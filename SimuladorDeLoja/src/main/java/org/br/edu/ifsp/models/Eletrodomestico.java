package org.br.edu.ifsp.models;

public class Eletrodomestico extends Produto{
    private String voltagem;

    public Eletrodomestico(String descricao, double precoUnitario, String voltagem) {
        super(descricao, precoUnitario);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }

    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "'\n'Descricao: '" + descricao + '\n' +
                "'\n'Preço Unitario: " + precoUnitario+'\n'+
                "'\n'Voltagem: '" + this.getVoltagem();
    }
}
