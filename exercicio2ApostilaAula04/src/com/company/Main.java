package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        2. Crie um programa que peça 10 números inteiros e apresente: a média, o maior e o
        menor.
         */
        Scanner leitor = new Scanner(System.in);
        double media = 0;
        int maiorValor = 0, menorValor = 0, valorDigitado;
        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº valor: \n", i +1 );
            valorDigitado = leitor.nextInt();
            if( i == 0 ){
                maiorValor = valorDigitado;
                menorValor = valorDigitado;
                media += valorDigitado;
            }else if(valorDigitado < menorValor){
                menorValor = valorDigitado;
                media += valorDigitado;
            }else if (valorDigitado > maiorValor){
                maiorValor = valorDigitado;
                media += valorDigitado;
            }else{
                media += valorDigitado;
            }
        }
        System.out.printf("A média dos valores é %.2f , o maior valor digitado é %d , o" +
                " menor valor digitado é %d !!!", media / 10 , maiorValor, menorValor);

    }
}
