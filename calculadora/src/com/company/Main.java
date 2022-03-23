package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int valor1;
        int valor2;
        int res;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        valor2 = leitor.nextInt();
        res = valor1 + valor2;
        System.out.printf("O resultado é %s ",res);
        leitor.close();
    }
}
