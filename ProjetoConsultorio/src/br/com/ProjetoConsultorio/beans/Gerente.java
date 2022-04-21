package br.com.ProjetoConsultorio.beans;

import java.util.Date;

public class Gerente extends Funcionario {

    private String deptoResponsavel;

    public Gerente(){}
    public Gerente(String nome, String cpf, double salario, Date dtAdmissao,
                   Date dtDemissao, String deptoResponsavel) {
        super(nome, cpf, salario, dtAdmissao, dtDemissao);
        this.deptoResponsavel = deptoResponsavel;
    }

    public String getDeptoResponsavel() {
        return deptoResponsavel;
    }

    public void setDeptoResponsavel(String deptoResponsavel) {
        this.deptoResponsavel = deptoResponsavel;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "deptoResponsavel='" + deptoResponsavel + '\'' +
                "} \n" + super.toString();
    }
}
