package beans;

public class ContaBancaria {

    private int numeroDaConta;
    private double saldo;

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
        System.out.println("Seu saldo na conta " + this.numeroDaConta + " é de R$ " + this.saldo);
    }

    public void saque(double valor) {
        if (this.saldo - valor < 0) {
            System.out.println("Saldo insuficiente para retirada do valor : R$ " + valor);
        } else {
            this.saldo -= valor;
        }
        extrato();
    }

    public void deposito(double valor) {
        this.saldo += valor;
        extrato();
    }
}
