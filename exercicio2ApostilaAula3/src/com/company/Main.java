package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
       2. Uma empresa irá dar um aumento de salário aos seus funcionários de acordo
        com a categoria de cada empregado. O aumento seguirá a seguinte regra:
        • Funcionários das categorias A, C, F, e H ganharão 10% de aumento sobre o    salário;
        • Funcionários das categorias B, D, e T ganharão 15% de aumento sobre o salário;
        • Funcionários das categorias K e R ganharão 25% de aumento sobre o salário
         */
        Scanner leitor= new Scanner(System.in);
        char categoria ;
        float salarioAtual;
        final String categoriasExistentes = "ACFHBDTKR";
        final String aumentoDez = "ACFH";
        final String aumentoQuinze = "DBT";
        final String aumentoVinte= "KR";

        System.out.println("Digite o salário atual");
        salarioAtual = leitor.nextFloat();
        System.out.println("Digite o tipo da categoria do funcionário (A/C/F/H/B/D/T/K/R)");
        categoria = leitor.next().charAt(0);
        while (!(categoriasExistentes.contains(Character.toString(Character.toUpperCase(categoria))))){
            System.out.println("Categoria inexistente, digite o tipo da categoria do funcionário (A/C/F/H/B/D/T/K/R)");
            categoria = leitor.next().charAt(0);
        }
        if (aumentoDez.contains(Character.toString(Character.toUpperCase(categoria)))){
            salarioAtual *= 1.1f;
        }else if(aumentoQuinze.contains(Character.toString(Character.toUpperCase(categoria)))){
            salarioAtual *= 1.15f;

        }else if (aumentoVinte.contains(Character.toString(Character.toUpperCase(categoria)))){
            salarioAtual *= 1.25f;
        }
        System.out.println("Salário atualizado será de:  "+ salarioAtual);

    }
}
