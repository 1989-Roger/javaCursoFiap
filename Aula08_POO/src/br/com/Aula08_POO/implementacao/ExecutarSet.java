package br.com.Aula08_POO.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSet {

    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<String>();

        // adicionar
        hashSet.add("azul");
        hashSet.add("verde");
        hashSet.add("vermelho");
        System.out.println(hashSet.add("preto"));
        System.out.println(hashSet.add("preto"));
        System.out.println(hashSet.toString());
        hashSet.remove("preto");
        System.out.println(hashSet.toString());
    }
}
