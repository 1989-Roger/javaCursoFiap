package br.com.aula4.beans;

import br.com.aula4.util.EntradaDados;

import java.util.Optional;

public class ContaBancaria {
    private Agencia banco;
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;
    private Double limiteEspecial = 0d;
    private boolean tipoDeConta;

    public Agencia getBanco() {
        return banco;
    }

    public void setBanco(Agencia banco) {
        this.banco = banco;
    }

    public ContaBancaria(){
    }
    public ContaBancaria( int numeroDaConta, double saldo, Cliente cliente, boolean tipoDeConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
        this.tipoDeConta = tipoDeConta;
    }
    public ContaBancaria(Agencia banco, int numeroDaConta, double saldo, Cliente cliente, boolean tipoDeConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
        this.tipoDeConta = tipoDeConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isTipoDeConta() {
        return tipoDeConta;
    }

    public Double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(Double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public boolean getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(boolean tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void extrato() {
            EntradaDados.show(extratoRetorno());
    }

    public void saque(double valor) {
        if ((this.saldo + this.limiteEspecial)  - valor < 0) {
            EntradaDados.show("Sem saldo disponível....");
        } else {
            this.saldo -= valor;
            EntradaDados.show("Sucesso....");
        }
        extrato();
    }

    public void deposito(double valor) {
        this.saldo += valor;
        extrato();
    }
    public void definirLimite(double limite){
        if(this.tipoDeConta && limite >= 0){
            this.limiteEspecial = limite;
            EntradaDados.show("Limite especial inserido com sucesso....");
        }else if(!this.tipoDeConta && limite > 0){
            EntradaDados.show("Tipo de conta inválida....");
        }else if(!this.tipoDeConta && limite == 0){
            this.limiteEspecial = 0d;
        }else{
            EntradaDados.show("Valor inserido inválido....");
        }
    }

    public Optional banco(){
        return Optional.empty();
    }
    public String extratoRetorno() {
        if(banco != null){
            return "ContaBancaria{" +
                    " banco='" + banco.toString() + '\'' +
                    ",numeroDaConta=" + numeroDaConta +
                    ", saldo=R$ " + String.format("%.2f",saldo) +
                    ", cliente='" + cliente.toString() + '\'' +
                    ", limiteEspecial= R$ " + String.format("%.2f",limiteEspecial) +
                    ", tipoDeConta=" + tipoDeConta +
                    '}';
        }else{
            return "ContaBancaria{" +
                    "numeroDaConta=" + numeroDaConta +
                    ", saldo=R$ " + String.format("%.2f",saldo) +
                    ", cliente='" + cliente.toString() + '\'' +
                    ", limiteEspecial= R$ " + String.format("%.2f",limiteEspecial) +
                    ", tipoDeConta=" + tipoDeConta +
                    '}';
        }

    }
    public void mensagemBoasvindas(){

    }
}
