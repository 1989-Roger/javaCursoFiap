package br.com.aula4.implementacao;

import br.com.aula4.beans.Agencia;
import br.com.aula4.beans.Cliente;
import br.com.aula4.beans.ContaBancaria;
import br.com.aula4.util.EntradaDados;

public class ExecutarContaBancaria {
    public static void main(String[] args) {

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
    }

}
