package br.com.ControleCatraca.implementacao;

import br.com.ControleCatraca.utils.EntradaDados;

import java.util.HashSet;
import java.util.Set;

public class ExecutarCatraca {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<Integer>();

        char entradaSaida;
        int numeroCracha;
        char saidaWhile;

        do {
            do {
                entradaSaida = Character.toUpperCase(EntradaDados.caracter("Digite <e> " +
                        "para entrada ou <s> para saída: "));
            } while (entradaSaida != 'E' && entradaSaida != 'S');

            numeroCracha = EntradaDados.inteiro("Digite a numeração do cracha: ");

            if (entradaSaida == 'E') {
                if (hashSet.add(numeroCracha)) {
                    EntradaDados.show("Bem vindo cracha : " + numeroCracha);
                } else {
                    EntradaDados.show("Entrada não permitida o crachá de número " + numeroCracha +
                            " entrou e ainda não saiu do parque");
                }
            } else if (entradaSaida == 'S') {
                if (hashSet.remove(numeroCracha)) {
                    EntradaDados.show("Obrigado pela visita cracha : " + numeroCracha);

                } else {
                    EntradaDados.show("Saída não permitida o crachá de número " + numeroCracha +
                            " não entrou no parque");
                }
            }
            System.out.println("Crachás no parque " + hashSet.toString());
            saidaWhile = Character.toUpperCase(EntradaDados.caracter("Digite <S> " +
                    "para sair do controle ou qualquer outra coisa para continuar "));
            if (saidaWhile == 'S') {
                break;
            }
        } while (true);


    }
}
