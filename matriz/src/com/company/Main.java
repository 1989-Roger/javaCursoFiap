package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        final int quantidadeLinhas = 5;
        final int quantidadeColunas = 3;

        double[][] matriz = new double[quantidadeLinhas][quantidadeColunas];

        for (int linha = 0; linha < quantidadeLinhas ; linha++){
            for(int coluna = 0; coluna < quantidadeColunas; coluna++){
                System.out.printf("Digite o elemento de [%s][%s]\n",linha,coluna );
                matriz[linha][coluna]= leitor.nextDouble();
            }
        }
        for (int linha = 0; linha < quantidadeLinhas ; linha++){
            for(int coluna = 0; coluna < quantidadeColunas; coluna++){
                System.out.printf("Resultado de [%s][%s] : %s \n",linha,coluna,matriz[linha][coluna] );
            }
        }
        leitor.close();
    }
}
