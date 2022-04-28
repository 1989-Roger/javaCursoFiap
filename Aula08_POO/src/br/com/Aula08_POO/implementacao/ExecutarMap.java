package br.com.Aula08_POO.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMap {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        // add elementos

        hashMap.put(10, "Azul");
        hashMap.put(5, "Preto");
        hashMap.put(20, "Verde");
        System.out.println(hashMap.toString());
        hashMap.put(5,"Branco");
        System.out.println(hashMap.toString());
        System.out.println("Lista de Chaves: " + hashMap.keySet());
        System.out.println("Lista de valores: " + hashMap.values());


        for(Map.Entry item: hashMap.entrySet()){
            System.out.println("Conteudo " + item.getKey() +" - "+ item.getValue() );
        }

        // procura elemento

        System.out.println("Tem a chave 20? "+ hashMap.containsKey(20));
        System.out.println("Tem a cor Azul? "+ hashMap.containsValue("Azul"));
        System.out.println("Obter o valor armazenado na chave 20: " +  hashMap.get(20));
        System.out.println("Remover chave 20: " + hashMap.remove(20));
        System.out.println(hashMap.toString());







    }
}
