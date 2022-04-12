package beans;

import java.util.Date;

public class AgendaRevisao {

    public String cliente;
    public String modelo;
    public long kmVeiculo;
    public Date dataRevisao;
    public Date horaRevisao;

    public void agendar(){
        System.out.println("====================================");
        System.out.println("    Agendamento efetuado....");
        System.out.println("====================================");

    }

    public void cancelarAgendamento(){
        System.out.println("Agendamento cancelado");
    }
}
