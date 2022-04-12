package beans;

public class Televisor {

    private int canal = 1;
    private int volume = 0;
    private boolean ligado = false;

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (this.ligado) {
            if (canal > 16) {
                System.out.println("Canal já está no máximo ");
                this.canal = 16;
            } else if (canal < 0) {
                this.canal = 0;
            } else {
                this.canal = canal;
            }
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        if (this.ligado) {
            if (volume > 10) {
                System.out.println("Volume já está no máximo");
                this.volume = 10;
            } else if (volume < 0) {
                this.volume = 0;
            } else {
                this.volume = volume;
            }

        } else {
            System.out.println("Televisão está desligada, não é possível aumentar o volume");
        }

    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        if (ligado == this.ligado) {
            System.out.println("Televisor se encontra no mesmo status que entrada no controle");
        } else {
            this.ligado = ligado;
        }
    }

    public void aumentarVolume() {
        setVolume(getVolume() + 1);
    }

    public void diminuirVolume() {
        setVolume(getVolume() - 1);
    }

    public void subirCanal() {
        setCanal(getCanal() + 1);

    }

    public void descerCanal() {
        setCanal(getCanal() - 1);
    }

    public void ligarTelevisor() {
        setLigado(true);
    }

    public void desligarTelevisor() {
        setLigado(false);
    }

    public void mostraStatus() {
        if (this.ligado) {
            System.out.println("Televisão ligada ... " + " - Canal: " + this.canal +
                    " - Volume: " + this.volume);
        } else {
            System.out.println("Televisão desligada");
        }


    }
}
