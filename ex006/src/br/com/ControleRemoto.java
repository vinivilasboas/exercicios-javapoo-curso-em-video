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
        if (this.isLigado()){ // só aumenta o volume se estiver ligado
            if (this.getVolume() < 100) { // volume máximo: 100
                this.setVolume(this.getVolume() + 5); // volume aumenta de 5 em 5
            }
            System.out.println("VOLUME: " + this.getVolume());
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            if (this.getVolume() > 0) { // volume mínimo: 00
                this.setVolume(this.getVolume() - 5); // volume diminui de 5 em 5
            }
            System.out.println("VOLUME: " + this.getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado()) { // para ligar mudo precisa estar ligado
            if (this.getVolume() > 0) { // para ligar mudo o volume não pode estar zerado
                this.setVolume(0);
            }
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) { // para desligar mudo precisa estar ligado
            if (this.getVolume() == 0){ // para desligar mudo o volume precisa estar em 0
                this.setVolume(50); // ao desligar mudo, volume passa para 50
            }
        }
    }

    @Override
    public void play() { // para dar play precisa estar ligado
        if (this.isLigado()) {
            this.setTocando(true); // ao dar play, passa a tocar
        }
    }

    @Override
    public void pause() { // para dar pause precisa estar ligado
        if (this.isLigado()) {
            this.setTocando(false); // ao dar pause, para de tocar
        }
    }

}

