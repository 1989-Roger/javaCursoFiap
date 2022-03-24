package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char tipoPagamento;
        float valorTotalCompra;
        float valorFinal = 0;
        final float pix = 0.9f;
        final float debito = 1f;
        final float credito = 1.05f;

        System.out.println("Digite o valor total da compra:");
        valorTotalCompra = leitor.nextFloat();
        System.out.println("Digite a forma de pagamento P=PIX, D=Débito, C=Crédito");
        tipoPagamento = leitor.next().charAt(0);
        tipoPagamento = Character.toUpperCase(tipoPagamento);
        while (tipoPagamento != 'P' && tipoPagamento != 'C' && tipoPagamento != 'D') {
            System.out.println("Tipo de pagamento digitado inválido, favor digitar P=PIX, D=Débito, C=Crédito");
            tipoPagamento = leitor.next().charAt(0);
            tipoPagamento = Character.toUpperCase(tipoPagamento);
        }
        if (tipoPagamento  == 'P'){
            valorFinal = valorTotalCompra * pix;
        }else if (tipoPagamento  == 'D'){
            valorFinal = valorTotalCompra * debito;
        }else if (tipoPagamento  == 'C'){
            valorFinal = valorTotalCompra * credito;
        }
        System.out.printf("O valor da compra final é R$ %.2f",valorFinal);
        leitor.close();
    }
}
