package br.com;

/**
*
* @autor vinivilasboas
 */

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // caneta c1 instanciada
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta(); // caneta c2 instanciada
        c2.modelo = "Bicona";
        c2.cor = "Preto";
        c2.carga = 60;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }

}
