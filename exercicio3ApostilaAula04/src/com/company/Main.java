package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        3. Sem utilizar a operação de multiplicação, escreva um programa que multiplique dois
        números inteiros.
        Por exemplo: 2 * 2 = 2 + 2.
         3 * 4 = 4 + 4 + 4
         */
        Scanner leitor = new Scanner(System.in);
        int primeiroValor;
        int segundoValor;
        int somaMultiplicacao = 0;
        System.out.println("Digite o primeiro valor para a multiplicação: ");
        primeiroValor = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoValor = leitor.nextInt();
        for(int i = 0;i < primeiroValor; i++){
            somaMultiplicacao += segundoValor;
        }
        System.out.println("O resultado da multiplicação é "+ somaMultiplicacao);
        leitor.close();
    }
}
