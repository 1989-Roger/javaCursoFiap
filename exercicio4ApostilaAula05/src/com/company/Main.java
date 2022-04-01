package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    4. Faça um algoritmo que some o conteúdo de dois vetores e armazene o
    resultado em um terceiro vetor.

 */
        Scanner leitor = new Scanner(System.in);
        int tamanho  ;
        while(true){
            System.out.println("Digite o tamanho dos vetores: ");
            tamanho = leitor.nextInt();
            if(tamanho > 0 ){
                break;
            }else{
                System.out.println("Valor deve ser maior que 0, tente novamente");
            }
        }
        double vetor1[] = new double[tamanho];
        double vetor2[] = new double[tamanho];
        double vetor3[] = new double[tamanho];
        for(int i= 0 ; i < vetor1.length; i++){
            System.out.printf("Digite o valor do elemento [%s] do vetor 1: \n", i);
            vetor1[i] = leitor.nextDouble();
        }
        for(int i= 0 ; i < vetor2.length; i++){
            System.out.printf("Digite o valor do elemento [%s] do vetor 2: \n", i);
            vetor2[i] = leitor.nextDouble();
        }
        for(int i= 0 ; i < vetor3.length; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
            System.out.printf("O valor do elemento [%s] é : %.2f \n", i, vetor3[i]);
        }
        leitor.close();

    }
}
