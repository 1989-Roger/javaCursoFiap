package br.com.Aula07.implementacao;


import br.com.Aula07.beans.Aluno;
import br.com.Aula07.beans.Livro;
import br.com.Aula07.utils.EntradaDados;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarLivro {

    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<Livro>();
        Livro[] listagemLivros = new Livro[3];
        for (int posicao = 0; posicao < listagemLivros.length; posicao++) {
            listaLivros.add(new Livro(EntradaDados.texto("Digite o nome do " + (posicao+1) + "o livro"),
                    EntradaDados.texto("Digite o nome do autor " + (posicao+1) + "o livro"),
                    EntradaDados.texto("Digite o nome do isbn " + (posicao+1) + "o livro"),
                    EntradaDados.inteiro("Digite a quantidade de paginas do " + (posicao+1) + "o livro"),
                    EntradaDados.valor("Digite o valor do " + (posicao+1) + "o livro") ));
        }

        /*
        Livro l1 = new Livro("Aprendendo Java","Javero","123434",40,500.50);
        Livro l2 = new Livro("Aprendendo C#","C#","12345",50,300.60);
        Livro l3 = new Livro("Aprendendo python","Py","102873",30,400.78);

        listaLivros.add(l1);
        listaLivros.add(l2);
        listaLivros.add(l3);
*/
            Collections.sort(listaLivros);
            System.out.println("Lista ordenada:\n" + listaLivros);

        }


}
