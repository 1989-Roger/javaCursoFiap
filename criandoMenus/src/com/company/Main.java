package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double num1 = 0, num2 = 0, resultado;
        int opcao;
        while(true){
            System.out.println("================================");
            System.out.println("      Calculadora em JAVA");
            System.out.println("================================");

            System.out.println("Digite a opção desejada: \n1- Somar \n2 - Substrair" +
                    "\n3 - Multiplicar \n4 - Dividir \n0 - Sair");
            opcao = leitor.nextInt();
            if(opcao == 0 ){
                System.out.println("Processo finalizado");
                break;
            }else if(opcao > 1 && opcao < 4){
                System.out.println("Digite o primeiro número: ");
                num1 = leitor.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = leitor.nextDouble();
            }else{
                System.out.println("Opção inválida");
            }
            if(opcao > 1 && opcao < 4){
                switch (opcao){
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("A soma dos valores é " + resultado + "\n\n");
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("A substração dos valores é " + resultado+ "\n\n");
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("A multiplicação dos valores é " + resultado+ "\n\n");
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("A divisão dos valores é " + resultado+ "\n\n");
                        break;
                }
            }
            
        }

    }
}
