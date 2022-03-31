package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        4. Faça um algoritmo que leia um conjunto de números e imprima sua soma
        (Soma) e sua média (Media). Admita que o valor 9999 é utilizado como fim de
        leitura.
        Ex.: 1, 2, 3, 9999 => Soma=6 Media=2
         */
        Scanner leitor = new Scanner(System.in);
        int numeroDigitado;
        double media;
        int soma = 0 ;
        int quantidade = 0;
        while(true){
            System.out.println("Digite um número ou digite 9999 para sair");
            numeroDigitado = leitor.nextInt();
            if(numeroDigitado == 9999){
                break;
            }
            quantidade++;
            soma += numeroDigitado;
        }
        if(quantidade != 0){
            media = soma / quantidade;
            System.out.printf("A soma é %d e a média é %.2f",soma, media);
        }else{
            System.out.println("Operação abortada, nenhum número foi digitado");
        }

        leitor.close();
    }
}
