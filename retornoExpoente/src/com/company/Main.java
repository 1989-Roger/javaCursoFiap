package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
     elabore um programa com uma função que solicita a digitação de dois numeros
     sendo o primeiro a base e o segundo o expoente. Faça o cálculo e exiba o resultado
     retorne o resultado
     Não utilizar math.pow
     */
        Scanner leitor = new Scanner(System.in);
        double base;
        int expoente;
        char opcao = 'N';

        do{
            System.out.println("Digite o valor da base: ");
            base = leitor.nextDouble();
            System.out.println("Digite o valor do expoente: ");
            expoente = leitor.nextInt();
            System.out.printf("O valor de %s elevado a %d resulta em " +
                    "%.2f \n\n", base, expoente, calculaExponencial(base, expoente));
            System.out.println("Deseja sair? Digite S/N :");
            opcao = Character.toUpperCase(leitor.next().charAt(0));

        }while(opcao != 'S');

        leitor.close();

    }

    public static double calculaExponencial(double base, int expoente) {
        double valorFinal = 1;
        for (int i = 1; i < expoente; i++) {
            base *= base;
        }
        valorFinal = base;
        return valorFinal;
    }
}
