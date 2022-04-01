package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    2. Faça um algoritmo que leia uma matriz mat 2 x 3 e imprima na tela a soma
    de todos os elementos pares da matriz mat.

 */
        Scanner leitor = new Scanner(System.in);
        int matriz[][] = new int[2][3];
        int numeroDigitado;
        int somaPares =0;
        for(int i =0 ; i < 2; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.printf("Digite o elemento [%s][%s]: \n",i ,j );
                numeroDigitado = leitor.nextInt();
                matriz[i][j] = numeroDigitado;
                if(numeroDigitado % 2 == 0){
                    somaPares += numeroDigitado;
                }
            }
        }
        System.out.printf("A soma dos pares é %s",somaPares);
        leitor.close();
    }
}
