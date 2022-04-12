package implementacao;

import beans.ContaBancaria;

import java.util.Scanner;

public class ExecutarContaBancaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        char operacao;
        String desejaSair = "";
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Digite o número da conta corrente");
        conta.setNumeroDaConta(leitor.nextInt());
        leitor.nextLine();
        System.out.println("Digite o saldo da conta");
        conta.setSaldo(leitor.nextDouble());
        leitor.nextLine();

        do {
            System.out.println("Qual operação deseja realizar? Digite D para depósito e S para saque");
            operacao = Character.toUpperCase(leitor.nextLine().charAt(0));
            if (operacao == 'S') {
                System.out.println("Digite a quantia para saque...");
                conta.saque(leitor.nextDouble());
            } else if (operacao == 'D') {
                System.out.println("Digite a quantia para o deposito...");
                conta.deposito(leitor.nextDouble());
            } else {
                System.out.println("Opção inválida !!! ");
            }
            leitor.nextLine();
            System.out.println("Digite sair para sair ou digite outra coisa para continuar");
            desejaSair = leitor.nextLine();

        } while (!desejaSair.equalsIgnoreCase("sair"));
        System.out.println("Processo finalizado ....");

        leitor.close();

    }

}
