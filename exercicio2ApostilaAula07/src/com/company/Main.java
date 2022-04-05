package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    2. Refaça o exercício 01 de forma que o método receba por parâmetro o salário
    atual e o índice de reajuste.

 */
        Scanner leitor = new Scanner(System.in);
        double salario,reajuste;
        System.out.println("Digite o salário do funcionário: ");
        salario = leitor.nextDouble();
        System.out.println("Digite o índice % de reajuste");
        reajuste = leitor.nextDouble();
        leitor.close();
        exibeResultado(salario,reajuste);
    }
    public static void exibeResultado(double salario,double reajuste){
        double salarioReajustado;
        salarioReajustado = salario + (salario * (reajuste / 100));
        System.out.printf("O Salário reajustado é de R$%.2f",salarioReajustado);
    }
}
