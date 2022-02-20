package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Aula09 {

    public static void main(String[] args) {

        Pessoa jose = new Pessoa("José", 35, "masculino");

        jose.fazerAniversario();

        Livro l1 = new Livro("A Rosa do Povo", "Carlos Drummond de Andrade", 100, jose);

        l1.folhear(45);
        l1.avancarPagina();
        l1.avancarPagina();

        System.out.println(jose.getNome() + ", de " + jose.getIdade() + " anos,  está na página " + l1.getPaginaAtual());

        l1.fechar();
        l1.abrir(80);
        l1.voltarPagina();

        System.out.println(jose.getNome() + ", de " + jose.getIdade() + " anos,  está na página " + l1.getPaginaAtual());

    }

}
