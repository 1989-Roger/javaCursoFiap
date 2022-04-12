package implementacao;

import beans.Televisor;

import java.util.Scanner;

public class ExecutarTelevisor {

    public static void main(String[] args) {

        Televisor controle = new Televisor();
        controle.mostraStatus();

        controle.ligarTelevisor();
        controle.setCanal(10);
        controle.setVolume(7);
        controle.setLigado(true);
        controle.mostraStatus();

        controle.desligarTelevisor();
        controle.mostraStatus();

        controle.ligarTelevisor();
        for (int i = 0; i < 2; i++) {
            controle.aumentarVolume();
        }
        for (int i = 0; i < 1; i++) {
            controle.subirCanal();
        }
        controle.mostraStatus();

        controle.descerCanal();
        for (int i = 0; i <= 3; i++) {
            controle.subirCanal();
        }
        for (int i = 0; i <= 2; i++) {
            controle.aumentarVolume();
        }
        controle.mostraStatus();

        controle.desligarTelevisor();
        controle.mostraStatus();

        controle.ligarTelevisor();
        for (int i = 0; i <= 4; i++) {
            controle.diminuirVolume();
            controle.descerCanal();
            controle.mostraStatus();
        }

    }
}
