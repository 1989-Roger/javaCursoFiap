package br.com.aula4.beans;

import java.util.Optional;

public class Agencia {

    private String razaoSocial;
    private int idBancario;

    public Agencia(){
    }

    public Agencia(String razaoSocial, int idBancario) {
        this.razaoSocial = razaoSocial;
        this.idBancario = idBancario;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }



    public int getIdBancario() {
        return idBancario;
    }

    public void setIdBancario(int idBancario) {
        this.idBancario = idBancario;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", idBancario=" + idBancario +
                '}';
    }
}
