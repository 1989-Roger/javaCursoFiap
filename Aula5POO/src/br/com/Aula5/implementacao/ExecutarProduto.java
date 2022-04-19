package br.com.Aula5.implementacao;

import br.com.Aula5.beans.Celular;
import br.com.Aula5.beans.Livro;
import br.com.Aula5.beans.Produto;

public class ExecutarProduto {

    public static void main(String[] args) {

       // Produto p2 = new Produto(20, 100, "Mouse com fio");
        Livro livro1 = new Livro(10,50,"Livro de Java","1234","Fiap School");
        System.out.println(livro1.detalhes());
        livro1.calcularImposto(1.2);
        Celular cel1 = new Celular(11, 1800, "Motorola XXX", 25, 128);
        System.out.println(cel1.detalhes());
        cel1.calcularImposto(1.3);
    }
}
