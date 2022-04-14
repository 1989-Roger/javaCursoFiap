package implementacao;

import beans.ContaBancaria;
import util.EntradaDados;

public class ExecutarContaBancaria {
    public static void main(String[] args) {

        char operacao;
        Boolean desejaSair = false;
        ContaBancaria conta = new ContaBancaria(
                EntradaDados.inteiro("Digite o número da conta corrente"),
                EntradaDados.valor("Digite o saldo da conta"),
                EntradaDados.texto("Digite o nome do cliente"),
                EntradaDados.logico("O tipo de conta é corrente ? Clique não para conta poupança")
                );
        conta.definirLimite( EntradaDados.valor("Digite o valor para limite da conta"));
        do {
            operacao = EntradaDados.caracter("Qual operação deseja realizar? " +
                    "Digite D para depósito e S para saque");
            if (operacao == 'S') {
                conta.saque(EntradaDados.valor("Digite o valor para saque"));
            } else if (operacao == 'D') {
                conta.saque(EntradaDados.valor("Digite a quantia para o deposito..."));
            } else {
                EntradaDados.show("Opção inválida !!! ");
            }
            desejaSair = EntradaDados.logico("Deseja sair ?");
        } while (!desejaSair);
        EntradaDados.show("Processo finalizado ....");
    }

}
