package br.com.aula4.beans;

import br.com.aula4.util.EntradaDados;

public class Corrente extends ContaBancaria {

    private double limite;
    private double taxa;

    public Corrente() {
    }

    public Corrente(Agencia banco, int numeroDaConta, double saldo, Cliente cliente, double limite, double taxa) {
        super(banco, numeroDaConta, saldo, cliente);
        this.limite = limite;
        this.taxa = taxa;
    }

    public void definirLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
            EntradaDados.show("Limite especial inserido com sucesso....");
        } else {
            EntradaDados.show("Valor inserido inválido....");
        }
    }

    public void definirTaxa(double taxa) {
        if (taxa >= 0) {
            this.taxa = taxa;
            EntradaDados.show("Taxa de juros inserido com sucesso....");
        } else {
            EntradaDados.show("Valor inserido inválido....");
        }
    }

    @Override
    public String extratoRetorno() {
        return super.extratoRetorno() + "Corrente{" +
                "limite=" + limite +
                ", taxa=" + taxa +
                "} ";
    }

    @Override
    public boolean saque(double valor) {

        try {
            if ((getSaldo() + limite) >= valor && valor < 500) {
                setSaldo(getSaldo() - valor);
                EntradaDados.show("Saque realizado com sucesso...., saldo disponível" + getSaldo());
                return true;
            }
            if (valor >= 500 && (getSaldo() + limite) - valor >= 0) {
                throw new Exception("Saques superiores a 500 reais não são permitidos....");
            } else {
                throw new Exception("Sem saldo disponível....");
            }
        } catch (Exception ex) {
            // como tratar a exceção
            EntradaDados.show(ex.getMessage());
            return false;
        }
    }
}
