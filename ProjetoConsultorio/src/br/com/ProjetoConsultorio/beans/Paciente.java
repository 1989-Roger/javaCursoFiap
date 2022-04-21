package br.com.ProjetoConsultorio.beans;

import java.util.Date;

public class Paciente extends Pessoa {

    public Paciente(String nome, String cpf, String fone) {
        super(nome, cpf, fone);
    }

    @Override
    public String toString() {
        return "Paciente{} " + super.toString();
    }
}
