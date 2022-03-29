package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*       EXEMPLO 1
        double altura1, altura2, altura3, altura4, altura5, altura6, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do 1º aluno");
        altura1 = leitor.nextDouble();
        System.out.println("Digite a altura do 2º aluno");
        altura2 = leitor.nextDouble();
        System.out.println("Digite a altura do 3º aluno");
        altura3 = leitor.nextDouble();
        System.out.println("Digite a altura do 4º aluno");
        altura4 = leitor.nextDouble();
        System.out.println("Digite a altura do 5º aluno");
        altura5 = leitor.nextDouble();
        System.out.println("Digite a altura do 6º aluno");
        altura6 = leitor.nextDouble();
        media = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6)/6;
        System.out.println("A media de altura dos alunos é de " + media);

 */
        /*
        Scanner leitor = new Scanner(System.in);
        double altura;
        double media;
        double somaAltura = 0;
        int quantidade;
        System.out.println("Digite a quantidade de alunos: ");
        quantidade = leitor.nextInt();
        for( int i = 0 ;i < quantidade; i++){
            System.out.printf("Digite a altura da %dª pessoa \n",i +1);
            altura = leitor.nextDouble();
            somaAltura += altura;
        }
        media = somaAltura / quantidade;
        System.out.printf("A média de altura é %.2f ",media);
        leitor.close();
        */
        Scanner leitor = new Scanner(System.in);
        double altura;
        double media;
        double somaAltura = 0;
        int quantidade = 0;

        while (true) {
            System.out.println("Digite a altura do aluno , para sair digite -1: ");
            altura = leitor.nextDouble();
            if (altura != -1 && altura > 0) {
                quantidade++;
                somaAltura += altura;
            } else if (altura == -1) {
                break;
            } else {
                System.out.println("Valor digitado inválido, será ignorado");
            }
        }
        if (quantidade > 0) {
            media = somaAltura / quantidade;
            System.out.printf("Foram digitados %d de pessoas, com altura média de %.2f \n", quantidade, media);

        } else {
            System.out.println("Não foram digitados valores válidos para se realizar uma média \n");
        }

        leitor.close();
    }
}
