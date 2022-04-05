package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        1. Escreva um programa com uma função que solicita a digitação do salário atual
        de um funcionário e o índice de reajuste. Exiba o salário reajustado.
*/
        calculaSalario();
    }

    public static void calculaSalario() {
        Scanner leitor = new Scanner(System.in);
        double salario, salarioReajustado, reajuste;
        System.out.println("Digite o salário do funcionário: ");
        salario = leitor.nextDouble();
        System.out.println("Digite o índice % de reajuste");
        reajuste = leitor.nextDouble();
        leitor.close();
        salarioReajustado = salario + (salario * (reajuste/ 100));
        System.out.printf("O Salário reajustado é de R$%.2f", salarioReajustado);
    }
}
