package beans;

import util.EntradaDados;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    private String cliente;
    private Double limiteEspecial = 0d;
    private boolean tipoDeConta;

    public ContaBancaria(){
    }
    public ContaBancaria(int numeroDaConta, double saldo, String cliente, boolean tipoDeConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.cliente = cliente;
       // this.limiteEspecial = limiteEspecial;
        this.tipoDeConta = tipoDeConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    public String extratoRetorno() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", saldo=R$ " + String.format("%.2f",saldo) +
                ", cliente='" + cliente + '\'' +
                ", limiteEspecial= R$ " + String.format("%.2f",limiteEspecial) +
                ", tipoDeConta=" + tipoDeConta +
                '}';
    }
}
