package br.com;

/**
 *
 * @author vinivilasboas
 */

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private int getVolume() {
        return volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(" ------ MENU ------ ");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("VOLUME: " + this.getVolume() + " ");
        for (int cont = 0; cont < this.getVolume(); cont += 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando MENU");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 5);
            }
            System.out.println("VOLUME: " + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 5);
            }
            System.out.println("VOLUME: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado()) {
            if (this.getVolume() > 0) {
                this.setVolume(0);
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) {
            if (this.getVolume() == 0){
                this.setVolume(50);
            }
        }
    }

    @Override
    public void play() {
        if (this.isLigado()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado()) {
            this.setTocando(false);
        }
    }

}

