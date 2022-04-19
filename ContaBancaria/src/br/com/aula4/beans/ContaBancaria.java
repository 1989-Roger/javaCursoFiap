package br.com.aula4.beans;

import br.com.aula4.util.EntradaDados;

import java.util.Optional;

public abstract class ContaBancaria {
    private Agencia banco;
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public Agencia getBanco() {
        return banco;
    }

    public void setBanco(Agencia banco) {
        this.banco = banco;
    }

    public ContaBancaria(){
    }
    public ContaBancaria( int numeroDaConta, double saldo, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
    }
    public ContaBancaria(Agencia banco, int numeroDaConta, double saldo, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        if ((this.saldo )  - valor < 0) {
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
                    '}';
        }else{
            return "ContaBancaria{" +
                    "numeroDaConta=" + numeroDaConta +
                    ", saldo=R$ " + String.format("%.2f",saldo) +
                    ", cliente='" + cliente.toString() + '\'' +
                    '}';
        }

    }
}
