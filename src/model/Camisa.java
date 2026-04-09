package model;

public class Camisa extends Produto {
    private String tamanho;

    public Camisa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tamanho: " + tamanho;
    }
}
