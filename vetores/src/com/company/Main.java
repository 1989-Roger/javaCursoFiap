package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int quantidade = 0;
        double nota = 0 ;
        double media = 0 ;
        while(true){
            System.out.println("Digite a quantidade de alunos na turma !!! ");
            quantidade = leitor.nextInt();
            if(!(quantidade > 0)){
                System.out.println("O valor deve ser superior a 0");
            }else{
                break;
            }
        }
        double aluno[]= new double[quantidade];

        for (int i = 0; i < aluno.length; i++){
            while(true){
                System.out.printf("Digite a nota do %sº aluno \n", i+ 1);
                nota = leitor.nextDouble();
                if(!(nota >= 0 && nota <= 10)){
                    System.out.println("Nota deve ser entre 0 ou 10 tente novamente");
                }else{
                    break;
                }
            }
            media += nota;
            aluno[i] =nota;
        }
        for(int i = 0; i < aluno.length; i++){
            System.out.printf("A nota do %sº é %.2f :\n",i+1,aluno[i]);
        }
        media = media /quantidade;
        System.out.println("A média foi de  "+ String.format("%.2f",media));
        leitor.close();
    }
}
