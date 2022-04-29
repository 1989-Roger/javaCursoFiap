package br.com.aula4.beans;

public class Poupanca extends ContaBancaria {

    private double rendimento;

    public Poupanca() {
    }

    public Poupanca(Agencia banco, int numeroDaConta, double saldo, Cliente cliente, double rendimento) {
        super(banco, numeroDaConta, saldo, cliente);
        this.rendimento = rendimento;

    }

    public String creditarRendimento() {
        double valor = ((rendimento / 100) * getSaldo() + getSaldo());
        setSaldo(valor);
        return "Sucesso";
    }

    @Override
    public String toString() {
        return super.extratoRetorno() + "Poupanca{" +
                "rendimento=" + rendimento +
                "} ";
    }
}
