package br.com.ProjetoLogin.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarException {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite VL1");
            int vl1 = entrada.nextInt();
            System.out.println("Digite VL2");
            int vl2 = entrada.nextInt();

            System.out.println("Divisão: " + vl1 / vl2);
        } catch (InputMismatchException ex) {
            System.out.println("Valor deve ser inteiro....");
        } catch (ArithmeticException ex){
            System.out.println("Não é permitido dividir número por 0....");
        }
        catch (Exception ex) {
            System.out.println("Ocorreu erro: ");
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }


        entrada.close();
    }
}
