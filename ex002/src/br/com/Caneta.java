package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Caneta {

    String modelo;
    String cor;
    float ponta; // tamanho da ponta
    int carga; // porcentagem de tinta
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando em " + this.cor);
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }


}
