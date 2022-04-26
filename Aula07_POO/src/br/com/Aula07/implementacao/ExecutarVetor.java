package br.com.Aula07.implementacao;

import br.com.Aula07.beans.Aluno;

import javax.swing.*;

public class ExecutarVetor {

    public static void main(String[] args) {
/*
        String listaNomes[] = {"Beatriz","Ana","Maria"};
        System.out.println(listaNomes[0]);
        listaNomes[0] = "Jose";
        System.out.println(listaNomes[0]);

        System.out.println(listaNomes.length);

        for (int posicao = 0; posicao < listaNomes.length ; posicao++){
            System.out.println("Indice " + posicao + " - Nome " +listaNomes[posicao]);
        }
        String procurar = JOptionPane.showInputDialog("Nome para pesquisar: ");
        for (int posicao = 0; posicao < listaNomes.length ; posicao++){
            if(listaNomes[posicao].equalsIgnoreCase(procurar)){
                System.out.println("Achou a " +listaNomes[posicao] + "na posição " + posicao);
            }
        }
*/
        // Usando objeto Aluno

        Aluno[] listaAlunos = new Aluno[3];
        listaAlunos[0] = new Aluno("Ana" , 8 , 0 , 20);
        listaAlunos[1] = new Aluno("Beatriz" , 6 , 10 , 25);
        listaAlunos[2] = new Aluno("Maria" , 5 , 5 , 10);
        String procurar = JOptionPane.showInputDialog("Nome para pesquisar: ");

        for (int posicao = 0; posicao < listaAlunos.length ; posicao++){
            listaAlunos[1].setFaltas(30);
            listaAlunos[1].setMedia(5);
            if(listaAlunos[posicao].getNome().equalsIgnoreCase(procurar)){
                JOptionPane.showMessageDialog(null,"Achou a " +listaAlunos[posicao].getNome() + "na posição " + posicao,
                        "objeto Aluno",1);
            }

                System.out.println("Aluno na posição "+ posicao + " = " + listaAlunos[posicao].toString());
        }


        }
}
