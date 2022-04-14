package util;

import javax.swing.*;

public class EntradaDados {

        public static String texto(String mensagem){
            return JOptionPane.showInputDialog(mensagem);
        }
        public static double valor(String mensagem){
            return Double.parseDouble(JOptionPane.showInputDialog(mensagem).replace(',', '.'));
        }
    public static int inteiro(String mensagem){
        return Integer.parseInt(JOptionPane.showInputDialog(mensagem).replace(',', '.'));
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
            JOptionPane.showMessageDialog(null, mensagem,"Apresentação", 1);
        }
        public static char caracter(String mensagem ){
            return Character.toUpperCase(JOptionPane.showInputDialog(mensagem).charAt(0));
        }
    }


