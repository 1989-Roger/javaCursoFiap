package implementacao;

import beans.Pessoa;


public class ExecutarPessoa {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fausto Silva");
        pessoa1.setIdade(50);
        pessoa1.setSentimento("nervoso");

        imprimeEntrada(pessoa1.getNome(),pessoa1.getIdade(),pessoa1.getSentimento());

        pessoa1.comer("feijoada");
        System.out.println("Sentimento atual, após comer: "+ pessoa1.getSentimento());

        pessoa1.dormir(6);
        System.out.println("Sentimento atual, após dormir: "+ pessoa1.getSentimento());

    }
    public static void imprimeEntrada(String nome,int idade, String sentimento){
        System.out.println("Dados do Cliente: ...");
        System.out.printf("Nome - %s\n", nome);
        System.out.printf("Idade - %s\n", idade);
        System.out.printf("Sentimento - %s\n", sentimento);
        System.out.println("==================================");
    }
}
