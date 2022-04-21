package br.com.FormacaoAcademica.implementacao;

import br.com.FormacaoAcademica.beans.Bacharelado;
import br.com.FormacaoAcademica.beans.Medio;
import br.com.FormacaoAcademica.beans.Tecnologo;

public  class ExecutarFormacao {
    public static void main(String[] args) {
/*
    final String tiposFormacao = "MBT";
    char selecionaFormacao = 'S';
    do {

    }while (selecionaFormacao != 'M');
*/
        Medio m = new Medio("Ensino Medio",3,1000,(short)1,"obrigatório");

    m.calcularMensalidade(5 );
        System.out.println("Mensalidade Medio : "+ m.getMensalidade());
        m.definirDuracao();
        System.out.println(m.getDuracao());
        Bacharelado b = new Bacharelado("Bacharel",2,
                60,(short)4,(short)(36),"Sim");
        b.calcularMensalidade(5 );
        System.out.println("Mensalidade Bacharelado : "+ b.getMensalidade());
        b.definirDuracao();
        System.out.println(b.getDuracao());

        Tecnologo t = new Tecnologo("Tecnologo",4,50,(short)2,true);
        t.calcularMensalidade(2 );
        System.out.println("Mensalidade Tecnologo : "+ t.getMensalidade());
    }

}
