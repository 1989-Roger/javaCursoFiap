package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        switch(variavel){
            case x :
                break;
            case y:
                break;
            case z:
                break;
            default:
                //instruções do default
         }
         */
        Scanner leitor = new Scanner(System.in);
        int opcao;
        System.out.println("ELOGIADOR!");
        System.out.println("Selecione a opção desejada:\n1-Elogio profissional\n2-Elogio físico\n3-Elogio pessoal");
        opcao = leitor.nextInt();
        switch(opcao) {
            case 1:
                System.out.println("Você é um profissional muito dedicado!");
                break;
            case 2:
                System.out.println("Você é uma pessoa muito forte!");
                break;
            case 3:
                System.out.println("Você é uma pessoa muito altruísta!");
                break;
            default:
                System.out.println("Opção inválida");
        }
        leitor.close();
    }
}
