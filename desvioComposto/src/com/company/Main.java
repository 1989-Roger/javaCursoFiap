package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner leitor = new Scanner(System.in);
        float valorDoacao,investimento;

        System.out.println("Digite o valor do investimento");
        valorDoacao = leitor.nextFloat();
        if (valorDoacao <= 1000){
            investimento = valorDoacao * 0.05f;
        }
        else{
            investimento = valorDoacao * 0.15f;
        }
        System.out.printf("Para doação do valor R$ %.2f , o valor do investimento é R$ %.2f",valorDoacao,investimento);

        leitor.close();
    }
}
