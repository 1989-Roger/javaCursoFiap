package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String username, senha;
        System.out.println("Digite o login: ");
        username = leitor.next();
        System.out.println("Digite a senha: ");
        senha = leitor.next();
        if (validarLogin(username, senha)) {
            System.out.println("Logado com sucesso");
            System.out.printf("Bem vindo administrador !!! \n");
        } else {
            System.out.println("Login ou senha inválido !!!");
        }
        leitor.close();
    }

    public static boolean validarLogin(String username, String senha) {
        if (username.equalsIgnoreCase("admin") && senha.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
