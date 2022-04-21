package br.com.ProjetoConsultorio.beans;

import java.util.Date;

public class Medico extends Funcionario{

    private String crm;
    private String especialidade;

    public Medico(){}
    public Medico(String nome, String cpf, double salario, Date dtAdmissao, Date dtDemissao,
                  String departamento, String crm, String especialidade) {
        super(nome, cpf, salario, dtAdmissao, dtDemissao, departamento);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", especialidade='" + especialidade + '\'' +
                "} \n" + super.toString();
    }
}
