package br.com.aula4.beans;

import br.com.aula4.excecoes.ControleExcecoes;
import br.com.aula4.util.EntradaDados;

import javax.swing.*;
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

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroDaConta, double saldo, Cliente cliente) {
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

    public boolean saque(double valor) throws ControleExcecoes {

        try {
            if ((this.saldo) - valor >= 0 && valor <= 500) {
                this.saldo -= valor;
                EntradaDados.show("Saque realizado com sucesso...., saldo disponível" + getSaldo());
                extrato();
                return true;
            }
            if (valor >= 500 && (this.saldo) - valor >= 0) {
                throw new Exception("Saques superiores a 500 reais não são permitidos....");
            } else {
                throw new Exception("Sem saldo disponível....");
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Deve ser inserido um valor numérico....");
            throw new ControleExcecoes("Log" , ex);
        }
        catch (Exception ex) {
            // como tratar a exceção
            extrato();
            EntradaDados.show(ex.getMessage());
            return false;
        }

    }

    public boolean deposito(double valor) {
        try {
            if (valor <= 1000 && valor >= 0) {
                this.saldo += valor;
                extrato();
                return true;
            }
            throw new Exception("O limite de depósito é de 1000 reais....");

        } catch (Exception ex) {
            EntradaDados.show(ex.getMessage());
            return false;
        }
    }

    public Optional banco() {
        return Optional.empty();
    }

    public String extratoRetorno() {
        if (banco != null) {
            return "ContaBancaria{" +
                    " banco='" + banco.toString() + '\'' +
                    ",numeroDaConta=" + numeroDaConta +
                    ", saldo=R$ " + String.format("%.2f", saldo) +
                    ", cliente='" + cliente.toString() + '\'' +
                    '}';
        } else {
            return "ContaBancaria{" +
                    "numeroDaConta=" + numeroDaConta +
                    ", saldo=R$ " + String.format("%.2f", saldo) +
                    ", cliente='" + cliente.toString() + '\'' +
                    '}';
        }

    }
}
