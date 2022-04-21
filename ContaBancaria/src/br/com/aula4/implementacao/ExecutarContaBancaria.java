package br.com.aula4.implementacao;

import br.com.aula4.beans.*;
import br.com.aula4.util.EntradaDados;

public class ExecutarContaBancaria {
    public static void main(String[] args) {
/*
        Agencia banco = new Agencia(EntradaDados.texto("Digite o banco do cliente"),
                EntradaDados.inteiro("Digite o id do banco")
                );

        Cliente cliente = new Cliente(EntradaDados.texto("Digite o nome do cliente"),
                EntradaDados.texto("Digite o cpf do cliente"),
                EntradaDados.texto("Digite o telefone do cliente"));

        char operacao;
        Boolean desejaSair = false;
        ContaBancaria conta = new ContaBancaria(
                //banco,
                EntradaDados.inteiro("Digite o número da conta corrente"),
                EntradaDados.valor("Digite o saldo da conta"),
                cliente,
                EntradaDados.logico("O tipo de conta é corrente ? Clique não para conta poupança")
                );
        conta.definirLimite( EntradaDados.valor("Digite o valor para limite da conta"));

        do {
            operacao = EntradaDados.caracter("Qual operação deseja realizar? " +
                    "Digite D para depósito e S para saque");
            if (operacao == 'S') {
                conta.saque(EntradaDados.valor("Digite o valor para saque"));
            } else if (operacao == 'D') {
                conta.deposito(EntradaDados.valor("Digite a quantia para o deposito..."));
            } else {
                EntradaDados.show("Opção inválida !!! ");
            }
            desejaSair = EntradaDados.logico("Deseja sair ?");
        } while (!desejaSair);

        EntradaDados.show("Processo finalizado ....");
 */
        int opcao;

        do {
            opcao = EntradaDados.inteiro("Digite 1 para conta corrente e 2 para conta poupança");
            if (opcao == 1) {
                ContaCorrente();
            } else if (opcao == 2) {
                ContaPoupanca();
            } else {
                EntradaDados.show("opção inválida....");
            }
        } while (opcao != 1 && opcao != 2);
    }

    public static void ContaCorrente() {
       /* Agencia banco = new Agencia(EntradaDados.texto("Digite o banco do cliente"),
                EntradaDados.inteiro("Digite o id do banco")
        );
*/
        char operacao;
        Boolean desejaSair = false;
        Agencia banco = new Agencia("Itau", 341);
/*
        Cliente cliente = new Cliente(EntradaDados.texto("Digite o nome do cliente"),
                EntradaDados.texto("Digite o cpf do cliente"),
                EntradaDados.texto("Digite o telefone do cliente"));

 */
        Cliente cliente = new Cliente("Roger", "00123456789", "11997890881");
        Corrente contaCorrente = new Corrente(
                banco,
                EntradaDados.inteiro("Digite o número da conta corrente"),
                EntradaDados.valor("Digite o saldo da conta"),
                cliente,
                0,
                EntradaDados.valor("Digite a taxa da conta corrente")
        );
        System.out.println(contaCorrente.extratoRetorno());
        contaCorrente.definirLimite(EntradaDados.valor("Digite o limite da conta corrente"));
        System.out.println(contaCorrente.extratoRetorno());
        do {
            operacao = EntradaDados.caracter("Qual operação deseja realizar? " +
                    "Digite D para depósito e S para saque");
            if (operacao == 'S') {
                contaCorrente.saque(EntradaDados.valor("Digite o valor para saque"));
            } else if (operacao == 'D') {
                contaCorrente.deposito(EntradaDados.valor("Digite a quantia para o deposito..."));
            } else {
                EntradaDados.show("Opção inválida !!! ");
            }
            desejaSair = EntradaDados.logico("Deseja sair ?");
        } while (!desejaSair);
    }

    public static void ContaPoupanca() {
        char operacao;
        Boolean desejaSair = false;
        Agencia banco = new Agencia("Itau", 341);
        Cliente cliente = new Cliente("Roger", "00123456789", "11997890881");
        Poupanca contaPoupanca = new Poupanca(
                banco,
                EntradaDados.inteiro("Digite o número da conta corrente"),
                EntradaDados.valor("Digite o saldo da conta"),
                cliente,
                EntradaDados.valor("Digite o rendimento da poupança..."));
        System.out.println(contaPoupanca.extratoRetorno());
        contaPoupanca.creditarRendimento();
        System.out.println(contaPoupanca.extratoRetorno());

        do {
            operacao = EntradaDados.caracter("Qual operação deseja realizar? " +
                    "Digite D para depósito e S para saque");
            if (operacao == 'S') {
                contaPoupanca.saque(EntradaDados.valor("Digite o valor para saque"));
            } else if (operacao == 'D') {
                contaPoupanca.deposito(EntradaDados.valor("Digite a quantia para o deposito..."));
            } else {
                EntradaDados.show("Opção inválida !!! ");
            }
            desejaSair = EntradaDados.logico("Deseja sair ?");
        } while (!desejaSair);
    }
}
