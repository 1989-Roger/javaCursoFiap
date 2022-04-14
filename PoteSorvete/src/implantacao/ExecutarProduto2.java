package implantacao;

import beans.Produto;
import javax.swing.*;

public class ExecutarProduto2 {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        p1.setNome(JOptionPane.showInputDialog("Digite o nome do produto!! "));
        p1.setMarca(JOptionPane.showInputDialog("Digite a marca do produto!! "));
        p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " +
                "do produto!! ").replace(',', '.')));
        int resp = JOptionPane.showConfirmDialog(null, "O produto esta em promoção? ",
                "Pergunta", JOptionPane.YES_NO_OPTION);
        if (resp == 1) {
            p1.setPromocao(false);
        } else {
            p1.setPromocao(true);
        }
        System.out.println(p1.detalhes());

        Produto p2 = new Produto(JOptionPane.showInputDialog("Digite o nome do produto!! ")
                , Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " +
                "do produto 2!! ").replace(',', '.')),
                JOptionPane.showInputDialog("Digite a marca do produto!! "),
                Boolean.parseBoolean(JOptionPane.showInputDialog("Em promoção")));
        System.out.println(p2.detalhes());


    }

}
