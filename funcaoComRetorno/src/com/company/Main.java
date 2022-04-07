package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeDeProdutos;
       double totalVenda;

        System.out.println("Entre com a quantidade de produtos no carrinho: ");
        quantidadeDeProdutos = leitor.nextInt();
        double produtos[] = new double[quantidadeDeProdutos];
        for(int i = 0; i < produtos.length; i++){
            System.out.printf("Digite o valor %d do produto\n", i+1);
            produtos[i] = leitor.nextDouble();
        }
        totalVenda = somarCarrinho(produtos);
        // conceder 10% de desconto, quando o total do carrinho for maior que 500 reais

        System.out.printf("O total do carrinho é R$ %.2f \n", totalVenda);

        leitor.close();

    }
    public static double somarCarrinho(double[] produtos){
        double soma = 0;
        double totalComDesconto;
        double totalVenda;
        final double valorParaDesconto = 500;
        final double desconto500 = 0.9;

        for (int i = 0 ; i < produtos.length ;i++ ){
            soma = soma + produtos[i];
        }
        //return soma;
        if (soma > valorParaDesconto){
            totalComDesconto = soma * desconto500;
            return totalComDesconto;
        }else{
            return soma;
        }
    }

}
