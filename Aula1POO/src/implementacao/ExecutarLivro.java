package implementacao;

import beans.Livro;

import java.util.Scanner;

public class ExecutarLivro {

    public static void main(String[] args) {
        Livro objetoLivro = new Livro();

        objetoLivro.titulo = "Livro de Java";
        objetoLivro.autor = "Lucas Book";
        objetoLivro.edicao = "3o. ed";
        objetoLivro.preco = 150.0;

        System.out.println("Dados do Livro ..");
        System.out.println("Titulo : "+objetoLivro.titulo);
        System.out.println("Autor: "+objetoLivro.autor);
        System.out.println("Edicao: "+objetoLivro.edicao);
        System.out.println("Preço: R$ "+String.format("%.2f", objetoLivro.preco));
        System.out.println("==============================================");
        Livro objetoLivro2 = new Livro();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o título do livro");
        objetoLivro2.titulo = leitor.nextLine();

        System.out.println("Digite o autor do livro");
        objetoLivro2.autor = leitor.nextLine();

        System.out.println("Digite a edição do livro");
        objetoLivro2.edicao = leitor.nextLine();

        System.out.println("Digite o preço do livro");
        objetoLivro2.preco = leitor.nextDouble();

        leitor.close();
        System.out.println("Dados do 2o Livro ....");
        System.out.println("Titulo : "+objetoLivro2.titulo);
        System.out.println("Autor: "+objetoLivro2.autor);
        System.out.println("Edicao: "+objetoLivro2.edicao);
        System.out.println("Preço: R$ "+String.format("%.2f", objetoLivro2.preco));

    }
}
