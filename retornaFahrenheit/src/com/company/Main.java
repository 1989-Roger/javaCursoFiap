package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor= new Scanner(System.in);
        double celsius;

        System.out.println("Digite o valor em celsius para ser realizada a conversão para Fahrenheit");
        celsius = leitor.nextDouble();
        leitor.close();
        System.out.printf("O valor de %.2fº celsius em Fahrenheit é %.2fº",celsius, calculaFahrenheit(celsius));

    }

    public static double calculaFahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }
}
