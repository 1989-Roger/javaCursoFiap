package br.com.ProjetoLogin.implementacao;

import br.com.ProjetoLogin.excecao.ControleException;

import javax.swing.*;

public class ExecutarControleException {
    public static void main(String[] args) throws ControleException {

        try{
            int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
            int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
            JOptionPane.showMessageDialog(null, "Resultado: " + (vl1 / vl2));

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Estamos com instabilidade....");
            throw new ControleException("Email" , ex);

        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null,"Estamos com instabilidade....");
            throw new ControleException("Log" , ex);

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Operação inválida....");
            throw new ControleException("Erro" , ex);
        }finally {
            JOptionPane.showMessageDialog(null,"Processo finalizado...");
        }
    }
}
