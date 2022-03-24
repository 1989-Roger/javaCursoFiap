package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade !!");
        idade = leitor.nextInt();
        if (idade < 16){
            System.out.print("Menor de 16 não pode embarcar !!");
        }else if(idade >= 16 && idade <= 17){
            System.out.print("Voto facultativo, embarque permitido !!");
        }else {
            System.out.print("Obrigado a votar !!");
        }
        leitor.close();
    }
}
