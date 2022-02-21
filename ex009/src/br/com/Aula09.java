package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Aula09 {

    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        // pessoas instanciadas
        pessoa[0] = new Pessoa("José", 35, "masculino");
        pessoa[1] = new Pessoa("Matilde", 21, "feminino");

        // livros instanciados
        livro[0] = new Livro("A Rosa do Povo", "Carlos Drummond de Andrade", 100, pessoa[0]);
        livro[1] = new Livro("A Gaivota", "Anton Tchekhov", 80, pessoa[0]);
        livro[2] = new Livro("Cem Anos de Solidão", "Gabriel García Márques", 200, pessoa[1]);


        pessoa[0].fazerAniversario();
        livro[1].folhear(45);
        livro[1].voltarPagina();
        livro[2].abrir(154);
        livro[2].avancarPagina();
        livro[2].avancarPagina();
        livro[2].avancarPagina();

        System.out.println("\n" + livro[0].toString());
        System.out.println("\n" + livro[1].toString());
        System.out.println("\n" + livro[2].toString());
    }

}
