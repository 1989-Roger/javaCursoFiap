package br.com.ControleCatraca.implementacao;

import br.com.ControleCatraca.utils.EntradaDados;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExecutarCatracaHashMap {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        DateTimeFormatter dataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

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

                if (!hashMap.containsKey(numeroCracha)) {
                    hashMap.put(numeroCracha, dataHora.format(LocalDateTime.now()));
                    EntradaDados.show("Bem vindo cracha : " + numeroCracha +
                            " na data/hora " + hashMap.get(numeroCracha));
                } else {
                    EntradaDados.show("Entrada não permitida o crachá de número " + numeroCracha +
                            " entrou e ainda não saiu do parque");
                }
            } else if (entradaSaida == 'S') {
                if (hashMap.containsKey(numeroCracha)) {
                    hashMap.remove(numeroCracha);
                    EntradaDados.show("Obrigado pela visita cracha : " + numeroCracha);

                } else {
                    EntradaDados.show("Saída não permitida o crachá de número " + numeroCracha +
                            " não entrou no parque");
                }
            }
            System.out.println("Crachás no parque " + hashMap);
            saidaWhile = Character.toUpperCase(EntradaDados.caracter("Digite <S> " +
                    "para sair do controle ou qualquer outra coisa para continuar "));
            if (saidaWhile == 'S') {
                break;
            }
        } while (true);
    }
}
