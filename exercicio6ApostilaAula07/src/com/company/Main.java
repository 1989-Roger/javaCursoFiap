package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        5. A Secretaria de Meio Ambiente que controla o índice de poluição mantém 03 grupos
        de indústrias que são altamente poluentes do meio ambiente. O índice de poluição
        aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são
        intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e
        2ºgrupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos
        devem ser notificados a paralisarem suas atividades. Faça um programa que contenha
        uma função que leia o índice de poluição medido e emita a notificação adequada aos
        diferentes grupos de empresas. O algoritmo só deve parar de rodar quando o usuário
        responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
6. Refazer o exercício 5 de forma que a função receba o índice de poluição do ar por parâmetro.
         */
        Scanner leitor = new Scanner(System.in);
        double indice;
        char desejaSair ='N';
        while(desejaSair != 'S'){
            System.out.println("Digite o índice de poluição medido");
            indice = leitor.nextDouble();
            validaPoluicao(indice);
            System.out.println("Deseja sair (Digite S para sair): ");
            desejaSair = Character.toUpperCase(leitor.next().charAt(0));
        }
        System.out.println("Finalizando o sistema ...");
        leitor.close();
    }
    public static void validaPoluicao(double indice){
        if(indice >= 0.05 && indice < 0.25){
            System.out.println("Índice de poluição aceitável");
        }else if(indice >= 0.25 && indice <= 0.3){
            System.out.println("As indústrias do 1o grupo estão intimadas " +
                    "e devem suspender suas atividades");
        }else if(indice > 0.3 && indice <= 0.4){
            System.out.println("As indústrias do 1o e 2o grupo estão intimadas" +
                    " e devem suspender suas atividades");
        }else if(indice >= 0.5){
            System.out.println("Todos os grupos estão notificados e devem paralizar suas atividades");
        }else{
            System.out.println("Índice de poluição praticamente nulo ou inválido, favor analisar novamente !!");
        }

    }
}


