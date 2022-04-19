package br.com.Aula5.beans;

import br.com.Aula5.interfaces.PadraoImposto;

public class Celular extends Produto  {

    private int cameraMega;
    private int armazenamento;

    public Celular(){}
    public Celular(int codigo, double preco, String descricao, int cameraMega, int armazenamento) {
        super(codigo, preco, descricao);
        this.cameraMega = cameraMega;
        this.armazenamento = armazenamento;
    }

    public int getCameraMega() {
        return cameraMega;
    }

    public void setCameraMega(int cameraMega) {
        this.cameraMega = cameraMega;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String detalhes() {
        return "Celular{" +
                "cameraMega=" + cameraMega +
                ", armazenamento=" + armazenamento +
                "} " + super.detalhes();
    }

}
