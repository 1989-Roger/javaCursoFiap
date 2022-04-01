package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    1. Faça um algoritmo que faça a união de dois vetores de mesmo tamanho e
    mesmo tipo em um terceiro vetor com dobro do tamanho.

 */
        Scanner leitor = new Scanner(System.in);
        int quantidade ;
        while(true){
            System.out.println("Digite o tamanho do vetor:");
            quantidade = leitor.nextInt();
            if(!(quantidade > 0 )){
                System.out.println("Valor deve ser superior a 0");
            }else{
                break;
            }
        }
        double vetor1[] = new double[quantidade];
        double vetor2[] = new double[quantidade];
        double vetorTotal[] = new double[vetor1.length + vetor2.length];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %sº elemento do vetor 1 :\n", i+1);
            vetor1[i] = leitor.nextDouble();
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o %sº elemento do vetor 2 :\n" , i+1);
            vetor2[i] = leitor.nextDouble();
        }
        leitor.close();
        System.arraycopy(vetor1, 0, vetorTotal, 0, vetor1.length);
        System.arraycopy(vetor2, 0, vetorTotal, vetor1.length, vetor2.length);
        for(int i = 0; i < vetorTotal.length; i++) {
            System.out.printf("O elemento %s do vetorTotal é : %s \n", i, vetorTotal[i]);
        }
    }
}
