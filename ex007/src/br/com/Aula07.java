package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Aula07 {

    public static void main(String[] args) {

        Lutador l[]  = new Lutador[6]; // vetor para instanciar 6 lutadores

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        l[1] = new Lutador ("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador ("Ufocobol", "Brasil", 37, 1.7f, 119.3f, 5, 4, 3);
        l[5] = new Lutador ("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        Luta luta01 = new Luta(); // instanciar luta
        luta01.marcarLuta(l[2], l[3]); // só é possível lutar se forem da mesma categoria e não forem o mesmo lutador
        luta01.lutar();

        l[2].status();
        l[3].status();

    }


}
