package util;

import javax.swing.*;

public class EntradaTela {

    public static String texto(String mensagem){
       return JOptionPane.showInputDialog(mensagem);
    }
    public static double valor(String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " +
                "do produto !! ").replace(',', '.'));
    }
    public static boolean logico(String mensagem){
        int resp = JOptionPane.showConfirmDialog(null, mensagem,
                "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resp == 1) {
            return false;
        } else {
            return true;
        }
    }
    public static void console(String log){
        System.out.println(log);
    }
    public static void show(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem,"Apresentação", 5);
    }
}
