package br.com.FormacaoAcademica.beans;

public class Bacharelado extends Formacao{

    private short cargaHorarioaEstagio;
    private String projetoConclusao;

    public Bacharelado(String descricao, int duracao, float mensalidade, short periodo, short cargaHorarioaEstagio, String projetoConclusao) {
        super(descricao, duracao, mensalidade, periodo);
        this.cargaHorarioaEstagio = cargaHorarioaEstagio;
        this.projetoConclusao = projetoConclusao;
    }

    public void calcularMensalidade(double fator){
        setMensalidade( (float) ((getMensalidade() * fator * 200) + (this.cargaHorarioaEstagio * 12)));
    }

    @Override
    public void definirDuracao() {
        if(this.getDescricao().equalsIgnoreCase("engenharia")){
            setDuracao(48);
        }else{
            setDuracao(60);
        }
    }
}
