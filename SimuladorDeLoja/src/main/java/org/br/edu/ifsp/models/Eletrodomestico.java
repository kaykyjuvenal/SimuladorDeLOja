package org.br.edu.ifsp.models;

public class Eletrodomestico extends Produto implements  IMostrarDados{
    private String voltagem;

    public Eletrodomestico(String descricao, double precoUnitario, String voltagem) {
        super(descricao, precoUnitario);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void mostrarDados() {
        System.out.println("Eletrodomestico{" +
                "'\n'Descricao: '" + this.getDescricao() +
                "'\n'Preço Unitario: " + this.getPrecoUnitario()+
                "'\n'Voltagem: '" + this.getVoltagem());
    }
}
