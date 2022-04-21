package br.com.FormacaoAcademica.beans;

public class Tecnologo extends Formacao {

    private boolean planoEstendido;

    public Tecnologo(){}
    public Tecnologo(String descricao, int duracao, float mensalidade, short periodo, boolean planoEstendido) {
        super(descricao, duracao, mensalidade, periodo);
        this.planoEstendido = planoEstendido;
    }

    public void calcularMensalidade(double fator){
            setMensalidade( (float) (getMensalidade() * fator * 200 ));


    }

    @Override
    public void definirDuracao() {
        setDuracao(24);
    }
}
