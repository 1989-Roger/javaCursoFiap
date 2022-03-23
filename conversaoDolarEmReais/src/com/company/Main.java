package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner leitor = new Scanner(System.in);
        float cotacaoDolar;
        float dolar;
        float reais;

        System.out.println("Digite a cotaçao do dolar ");
        cotacaoDolar = leitor.nextFloat();
        System.out.println("Digite a quantidade em dolares");
        dolar = leitor.nextFloat();
        reais = dolar * cotacaoDolar;
        System.out.printf("O valor de $ %.2f dolares é R$ %.2f reais", dolar, reais);
        leitor.close();

    }
}


