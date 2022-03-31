package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    5. Faça um algoritmo que calcule a média de salários de uma empresa,
    pedindo ao usuário a quantidade de funcionários e o salário de cada
    funcionário. Exiba a média salarial, o salário mais alto e o salário
     mais baixo.
 */
        Scanner leitor = new Scanner(System.in);
        int quantidadeFuncionarios;
        double salario;
        double mediaSalario = 0;
        double maiorSalario = 0;
        double menorSalario = 0;
        double salarioMinimo = 1212;
        System.out.println("Digite a quantidade de funcionários");
        quantidadeFuncionarios = leitor.nextInt();
        for (int i = 0; i < quantidadeFuncionarios; i++) {
            while (true) {
                System.out.printf("Digite o valor do %s° funcionário\n", i + 1);
                salario = leitor.nextDouble();
                if (salario < salarioMinimo) {
                    System.out.println("Salário inferior ao salário mínimo, tente novamente");
                } else {
                    break;
                }
            }
            if (i == 0) {
                maiorSalario = salario;
                menorSalario = salario;
            } else {
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                } else if (salario < menorSalario) {
                    menorSalario = salario;
                }
            }
            mediaSalario += salario;
        }
        System.out.printf("A média de salário é R$ %.2f , o maior salário é R$ %.2f e o menor salário é R$ %.2f",
                mediaSalario / quantidadeFuncionarios, maiorSalario, menorSalario);
        leitor.close();
    }
}
