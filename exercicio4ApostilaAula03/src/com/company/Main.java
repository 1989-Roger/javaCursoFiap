package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        4. Faça um algoritmo que leia 3 números inteiros distintos e escreva o menor
        deles.
         */
        Scanner leitor = new Scanner(System.in);
        int numeroInteiro;
        int menorValor;
        int quantidade = 1;
        do{

        }while(quantidade < 3);


        System.out.println("Digite o 1° valor");
        numeroInteiro = leitor.nextInt();
        menorValor = numeroInteiro;
        for (int percorreDigitados = 0;percorreDigitados < 2;percorreDigitados++){
            System.out.printf("Digite o %s° valor\n",percorreDigitados + 2);
            numeroInteiro = leitor.nextInt();
          if (numeroInteiro < menorValor ) {
                menorValor = numeroInteiro;
            }
        }
        System.out.println("O maior valor digitado foi " + menorValor);


    }
}
