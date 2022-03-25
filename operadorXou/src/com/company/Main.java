package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor =  new Scanner(System.in);
        Double umidade, temperatura;
        System.out.println("Por favor, insira a umidade relativa do ar:");
        umidade = leitor.nextDouble();
        System.out.println("Por favor, insira a temperatura em graus celsius: ");
        temperatura = leitor.nextDouble();
        if (umidade > 70.00 ^ temperatura > 26.00) {
            System.out.println("Ligando os ventiladores");
        }else {
            System.out.println("Entrar em contato com o agrônomo.");
        }
        leitor.close();

    }
}
