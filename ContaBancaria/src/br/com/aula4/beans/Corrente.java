package br.com.aula4.beans;

import br.com.aula4.util.EntradaDados;

public class Corrente extends ContaBancaria{

    private double limite;
    private double taxa;

    public Corrente(){}

    public Corrente(Agencia banco, int numeroDaConta, double saldo, Cliente cliente, double limite, double taxa) {
        super(banco, numeroDaConta, saldo, cliente);
        this.limite = limite;
        this.taxa = taxa;
    }

    public void definirLimite(double limite){
        if(limite >= 0) {
            this.limite = limite;
            EntradaDados.show("Limite especial inserido com sucesso....");
        }else{
            EntradaDados.show("Valor inserido inválido....");
        }
    }
    public void definirTaxa(double taxa){
        if(taxa >= 0) {
            this.taxa = taxa;
            EntradaDados.show("Taxa de juros inserido com sucesso....");
        }else{
            EntradaDados.show("Valor inserido inválido....");
        }
    }

    @Override
    public String toString() {
        return super.extratoRetorno() +"Corrente{" +
                "limite=" + limite +
                ", taxa=" + taxa +
                "} " ;
    }

    @Override
    public void saque(double valor) {
        if((getSaldo()+ limite) >= valor){
            setSaldo(getSaldo() - valor);
            EntradaDados.show("Saque realizado com sucesso...., saldo disponível" + getSaldo());
        }else{
            EntradaDados.show("Sem saldo disponível....");
        }
    }
}
