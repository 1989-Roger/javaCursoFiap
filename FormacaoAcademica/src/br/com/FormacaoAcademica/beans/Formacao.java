package br.com.FormacaoAcademica.beans;

import br.com.FormacaoAcademica.interfaces.FormacaoMetodos;

public abstract class Formacao implements FormacaoMetodos {

    private String descricao;
    private int duracao;
    private float mensalidade;
    private short periodo;

    public Formacao() {
    }

    public Formacao(String descricao, int duracao, float mensalidade, short periodo) {
        this.descricao = descricao;
        this.duracao = duracao;
        this.mensalidade = mensalidade;
        this.periodo = periodo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public short getPeriodo() {
        return periodo;
    }

    public void setPeriodo(short periodo) {
        this.periodo = periodo;
    }

    public float retornarMedia(float ps1, float ps2){
        float media;
        media = (ps1+ps2) / 2;
        return media;
    }
    public float retornarMedia( float ps1, float ps2, float nac1, float nac2){
        float media;
        media = ((ps1+ps2) /2) + ((nac1 + nac2 ) / 2) * 1.05f;
        return media;
    }
    public float retornarMedia( float ps1, float ps2, float nac1, float nac2, float am1, float am2){
        float media;
        media = (ps1+ps2 + nac1 + nac2 +am1 + am2) / 6;
        return media;
    }
/*
    public void definirDuracao(){
        System.out.println("Método definirDuracao não implementado");
    }
    public void calcularMensalidade(double fator){
        System.out.println("Método calcularMensalidade não implementado");

    }
*/
    @Override
    public String toString() {
        return "Formacao{" +
                "descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", mensalidade=" + mensalidade +
                ", periodo=" + periodo +
                '}';
    }
}
