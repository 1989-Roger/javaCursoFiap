package br.com.ProjetoConsultorio.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {
    SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");

    private Paciente paciente;
    private Date dataHora;
    private double valor;
    private Medico medico;
    private Funcionario atendente;

    public Agendamento(){}
    public Agendamento(Paciente paciente, Date dataHora, double valor, Medico medico, Funcionario atendente) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.valor = valor;
        this.atendente = atendente;
        this.medico = medico;
    }

    public SimpleDateFormat getFormataData() {
        return formataData;
    }

    public void setFormataData(SimpleDateFormat formataData) {
        this.formataData = formataData;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Funcionario getAtendente() {
        return atendente;
    }

    public void setAtendente(Funcionario atendente) {
        this.atendente = atendente;
    }

    public String consultaAgenda() {
        return "Agendamento{" +
                "paciente=" + paciente.getNome() +
                ", dataHora=" + formataData.format(dataHora) +
                ", valor da consulta=R$" + String.format("%.2f",valor) +
                ", medico=" + medico.getNome() +
                ", atendente=" + atendente.getNome() +
                '}';
    }

    public String agendar(){
        return "Agendamento realizado :\nDados: \n" + consultaAgenda();
    }

}
