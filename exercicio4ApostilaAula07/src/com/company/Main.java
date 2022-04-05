package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
    3. Faça um programa com uma função que solicita a digitação da idade de um
    nadador. Classifique-o em uma das seguintes categorias:
    - Infantil A = 5 a 7 anos
    - Infantil B = 8 a 11 anos
    - Juvenil A = 12 a 13 anos
    - Juvenil B = 14 a 17 anos
    - Adultos = Maiores de 18 anos
    4. Refazer o exercício 3 de forma que o método receba a idade por parâmetro.

 */
        Scanner leitor = new Scanner(System.in);
        int idadeNadador;
        String categoria;
        System.out.println("Digite a idade do nadador: ");
        idadeNadador = leitor.nextInt();
        leitor.close();
        exibeCategoria(idadeNadador);
    }
    public static void exibeCategoria(int idadeNadador){
        if(idadeNadador >= 5 && idadeNadador <= 7){
            System.out.println("Infantil A");
        }else if(idadeNadador >= 8 && idadeNadador <= 11){
            System.out.println("Infantil B");
        }else if(idadeNadador >= 12 && idadeNadador <= 13){
            System.out.println("Juvenil A");
        }else if(idadeNadador >= 14 && idadeNadador <= 17){
            System.out.println("Juvenil B");
        }else if(idadeNadador >= 18 ){
            System.out.println("Adultos");
        }else{
            System.out.println("Idade inválida para alocação em categorias");
        }
    }
}
