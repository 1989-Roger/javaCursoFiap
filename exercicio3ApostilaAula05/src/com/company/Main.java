package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    3. Leia uma matriz 3 x 2 e exiba a soma dos elementos da primeira linha e a
    soma dos elementos da primeira coluna.
 */
        Scanner leitor = new Scanner(System.in);
        final int linha = 3;
        final int coluna = 2;
        int matriz[][] = new int[linha][coluna];
        int numeroDigitado , somaLinha = 0, somaColuna = 0;

        for(int i = 0 ; i < linha;i++){
            for(int j = 0; j < coluna; j++){
                System.out.printf("Digite o valor de [%s][%s]: \n", i,j);
                numeroDigitado = leitor.nextInt();
                if(i == 0){
                    somaLinha += numeroDigitado;
                }
                if(j == 0){
                    somaColuna += numeroDigitado;
                }
            }
        }
        System.out.printf("A soma da primeira linha é %s e a soma da primeira coluna é %s\n", somaLinha, somaColuna);
        leitor.close();

    }
}
