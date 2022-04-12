package implementacao;

import beans.AgendaRevisao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ExecutarAgendamento {

    public static void main(String[] args) throws ParseException {
        // como configurar o padrão de data

        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formataHora = new SimpleDateFormat("hh:mm");

        System.out.println("Executar agendamento ..... !!!");

        AgendaRevisao cliente1 = new AgendaRevisao();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        cliente1.cliente = leitor.nextLine();

        System.out.println("Digite o modelo do carro");
        cliente1.modelo = leitor.nextLine();

        System.out.println("Digite a quilometragem do carro");
        cliente1.kmVeiculo = leitor.nextLong();
        leitor.nextLine();

        System.out.println("Digite a data do agendamento: ");
        cliente1.dataRevisao  = formataData.parse(leitor.nextLine());

        System.out.println("Digite a hora do agendamento: ");
        cliente1.horaRevisao = formataHora.parse(leitor.nextLine());


        cliente1.agendar();
        resultadoAgendamento(cliente1);
        leitor.close();

    }

    public static void resultadoAgendamento(AgendaRevisao cliente1){
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formataHora = new SimpleDateFormat("HH:mm");
        System.out.println("Dados do agendamento:");
        System.out.println("Cliente: "+cliente1.cliente);
        System.out.println("Modelo do Carro: "+ cliente1.modelo);
        System.out.println("Data do Agendamento: " + formataData.format(cliente1.dataRevisao));
        System.out.println("Hora do Agendamento: " + formataHora.format(cliente1.horaRevisao));
    }
}
