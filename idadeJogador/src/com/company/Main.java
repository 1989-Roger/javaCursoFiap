package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner leitor = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = leitor.nextInt();
        if (idade >= 12) {
            System.out.printf("Você possui %s anos ou mais, pode jogar !!", idade);
        } else{
            System.out.printf("Você é menor de 12 anos,PROIBIDO JOGAR !!");

        }
        leitor.close();
    }
}
