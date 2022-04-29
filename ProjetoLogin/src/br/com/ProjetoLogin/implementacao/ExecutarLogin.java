package br.com.ProjetoLogin.implementacao;

import br.com.ProjetoLogin.beans.Login;

import javax.swing.*;

public class ExecutarLogin {
    public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog("Usuario de acesso: ");
        String senha = JOptionPane.showInputDialog("digite a senha de login acesso: ");

        Login acesso = new Login();
        if(acesso.fazerLogin(usuario, senha)){
            JOptionPane.showMessageDialog(null,"Logado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"usuário / senha inválida....");
        }
    }
}
