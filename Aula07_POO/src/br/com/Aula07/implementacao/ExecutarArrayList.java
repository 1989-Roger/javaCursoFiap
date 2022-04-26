package br.com.Aula07.implementacao;

import br.com.Aula07.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarArrayList {

    public static void main(String[] args) {
/*
        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Ana");
        listaNomes.add("Beatriz");
        listaNomes.add("Pedro");
        listaNomes.add("Jose");
        listaNomes.add(0, "Cris");
        System.out.println("Tamanho do listaNomes: " + listaNomes.size());
        System.out.println("Mostrar conteudo: " + listaNomes);
        Collections.sort(listaNomes);
        System.out.println("Lista ordenada: " + listaNomes);

        // pesquisar
        String procurar = JOptionPane.showInputDialog("Digite o nome para pesquisa:");
        int posicao = listaNomes.indexOf(procurar);
        if(posicao >= 0){
            JOptionPane.showMessageDialog(null,"Achouuu  na posição "
                    +posicao,"Achou",1);

        }else{
            System.out.println("Não achou");
        }

 */
        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Maria" , 5 , 5 , 10);
        Aluno a4 = new Aluno("Ana", 8, 0, 20);
        Aluno a2 = new Aluno("Beatriz" , 6 , 10 , 25);
        Aluno a3 = new Aluno("Maria" , 5 , 5 , 10);

        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);


        System.out.println("Tamanho do listaNomes: " + listaAlunos.size());
        System.out.println("Mostrar conteudo: " + listaAlunos);
        System.out.println("Lista ordenada: " + listaAlunos);
        for(Aluno item : listaAlunos){
            System.out.println(item.getNome() + " - "+ item.getIdade());
        }

        Collections.sort(listaAlunos);
        System.out.println(listaAlunos.toString());

    }

}
