package br.com.Aula5.beans;

import br.com.Aula5.interfaces.PadraoImposto;

public abstract class Produto implements PadraoImposto {

    private int codigo;
    private double preco;
    private String descricao;

    public Produto(){}

    public Produto(int codigo, double preco, String descricao) {
        this.codigo = codigo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String detalhes() {
        return "Produto{" +
                "codigo=" + codigo +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }


    @Override
    public void calcularImposto(double percentual) {
        System.out.println(this.preco * percentual);
    }
}
