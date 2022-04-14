package implantacao;

import beans.Produto;

import javax.swing.*;

public class ExecutarProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("notebook", 100d);

        System.out.println(p1.getNome() + " - " + p1.getValor());

        Produto p2 = new Produto("impressora HP", 150);
        System.out.println(p2.getNome() + " - " + p2.getValor());

        Produto p3 = new Produto("celular", 1500,"Samsung" ,true);
        System.out.println(p3.detalhes());

        JOptionPane.showMessageDialog(null,p3.detalhes());
    }
}
