package br.com.aula4.implementacao;

import br.com.aula4.beans.Motor;
import br.com.aula4.beans.Veiculo;

public class ExecutarVeiculo {
    public static void main(String[] args) {

        Veiculo fusca = new Veiculo();
        Veiculo kombi = new Veiculo();
        Motor motorVw = new Motor(80, 4 ,"Gasolina");
        Motor motorVw2 = new Motor(100, 3 ,"Flex");




        fusca.setModelo("Fusca Itamar");
        fusca.setCategoria("Compacto");
        fusca.setPlaca("ABC1234");
        fusca.setPortas(2);
        //precisa ter 1 objeto motor
        fusca.setMotor(motorVw);

        System.out.println("Usando o fusca ....");
        System.out.println(fusca.getModelo() + " - "+ fusca.getMotor().toString());


        kombi.setModelo("Kombi do Surf");
        kombi.setMotor(motorVw2);
        System.out.println("Usando a kombi ....");
        System.out.println(kombi.getModelo() + " - "+ kombi.getMotor().toString());
    }
}
