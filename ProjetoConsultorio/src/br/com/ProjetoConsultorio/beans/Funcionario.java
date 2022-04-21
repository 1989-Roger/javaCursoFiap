package br.com.ProjetoConsultorio.beans;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Funcionario extends Pessoa{

    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
    private double salario;
    private Date dtAdmissao;
    private Date dtDemissao;
    private String departamento;

    public Funcionario(){}
    public Funcionario(String nome, String cpf, double salario, Date dtAdmissao,
                       Date dtDemissao, String departamento) {
        super(nome, cpf);
        this.salario = salario;
        this.dtAdmissao = dtAdmissao;
        this.dtDemissao = dtDemissao;
        this.departamento = departamento;
    }
    public Funcionario(String nome, String cpf, double salario, Date dtAdmissao,
                       Date dtDemissao) {
        super(nome, cpf);
        this.salario = salario;
        this.dtAdmissao = dtAdmissao;
        this.dtDemissao = dtDemissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDtAdmissao() {
        return dtAdmissao;
    }

    public void setDtAdmissao(Date dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Date getDtDemissao() {
        return dtDemissao;
    }

    public void setDtDemissao(Date dtDemissao) {
        this.dtDemissao = dtDemissao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        if(dtDemissao != null){
            return "Funcionario{" +
                    "salario=" + salario +
                    ", dtAdmissao=" + formataData.format(dtAdmissao) +
                    ", dtDemissao=" + formataData.format(dtDemissao) +
                    ", departamento='" + departamento + '\'' +
                    "} " + super.toString();
        }else{
            return "Funcionario{" +
                    "salario=" + salario +
                    ", dtAdmissao=" + formataData.format(dtAdmissao) +
                    ", departamento='" + departamento + '\'' +
                    "} " + super.toString();
        }
    }
}
