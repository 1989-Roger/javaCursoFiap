package br.com.ProjetoConsultorio.implementacao;

import br.com.ProjetoConsultorio.beans.Agendamento;
import br.com.ProjetoConsultorio.beans.Funcionario;
import br.com.ProjetoConsultorio.beans.Medico;
import br.com.ProjetoConsultorio.beans.Paciente;
import br.com.ProjetoConsultorio.utils.EntradaDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExecutarAgendamento {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


        Paciente paciente = new Paciente(EntradaDados.texto("Digite o nome do paciente"),
                EntradaDados.texto("Digite o cpf do paciente"),
                EntradaDados.texto("Digite o telefone do paciente"));


        System.out.println(paciente.toString());
        Medico medico = new Medico("Doutor Ranchu Chucrute", "012344567891", 10000,
                formato.parse("20/01/2020"), null, "Cirurgias",
                "12345", "Anestesista");
        System.out.println("\nDados Médico:\n" + medico.toString());
        Funcionario atendente = new Funcionario("Atendente 1", "01234567890", 2500,
                formato.parse("01/01/2018"),
               null, "Recepção");
        System.out.println(atendente.toString());
        Agendamento agendamento = new Agendamento(paciente, formato.parse("30/04/2022"),
                500,medico, atendente);
        EntradaDados.show(agendamento.agendar());
    }
}
