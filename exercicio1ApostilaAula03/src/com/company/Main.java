package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        1. Construa um algoritmo que receba como entrada três valores e os imprima em
        ordem crescente.
         */
        Scanner leitor = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;
        valor1 = leitor.nextInt();
        valor2 = leitor.nextInt();
        valor3 = leitor.nextInt();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println(valor1);
            if (valor2 < valor3) {
                System.out.println(valor2);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor2);
            }
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println(valor2);
            if (valor1 < valor3) {
                System.out.println(valor1);
                System.out.println(valor3);
            } else {
                System.out.println(valor3);
                System.out.println(valor1);
            }
        } else {
            System.out.println(valor3);
            if (valor1 < valor2) {
                System.out.println(valor1);
                System.out.println(valor2);
            } else {
                System.out.println(valor2);
                System.out.println(valor1);
            }
        }


    }
}
