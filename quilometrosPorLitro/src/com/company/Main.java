package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        float kmInicio;
        float kmFim;
        float diferencaKm;
        float litrosAbastecidos;
        float kmPorLitro;

        System.out.println("Digite a quilometragem do tacógrafo no início da viagem: ");
        kmInicio = leitor.nextFloat();

        System.out.println("Digite a quilometragem do tacógrafo no fim da viagem: ");
        kmFim = leitor.nextFloat();
        while (kmFim < kmInicio) {
            System.out.println("Foi digitado um valor menos para a quilometragem fim da viagem, tente novamente: ");
            kmFim = leitor.nextFloat();
        }
        System.out.println("Digite quantos litros foram abastecidos no posto");
        litrosAbastecidos = leitor.nextFloat();

        diferencaKm = kmFim - kmInicio;
        kmPorLitro = diferencaKm / litrosAbastecidos;

        System.out.printf("O carro fez uma média de %.2f km/litro !!!", kmPorLitro);
        leitor.close();

    }
}
