package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1. Construa um Algoritmo que, para um grupo de 10 valores inteiros, determine:
        a) A soma dos números positivos;
        b) A quantidade de valores negativos;
         */
        Scanner leitor = new Scanner(System.in);
        int numeroDigitado;
        int quantidadeNegativos = 0;
        int somaPositivos = 0;
        while(true){
            somaPositivos = 0;
            quantidadeNegativos = 0;
            for(int i = 0 ; i < 10; i++){
                System.out.printf("Digite o %dº valor \n",i+1);
                numeroDigitado = leitor.nextInt();
                if(numeroDigitado >= 0 ){
                    somaPositivos += numeroDigitado;
                }else if(numeroDigitado < 0 ){
                    quantidadeNegativos++;
                }
            }
            System.out.printf("A soma dos números positivos é %d e a quantidade de negativos é %d",somaPositivos,
                    quantidadeNegativos);

        }
    }
}
