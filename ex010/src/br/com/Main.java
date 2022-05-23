package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Main {

    public static void main (String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setGenero("masculino");
        p1.setIdade(21);
        p2.setNome("Maria");
        p2.setGenero("feminino");
        p2.setIdade(16);
        p3.setNome("Cláudio");
        p3.setGenero("masculino");
        p3.setIdade(48);
        p4.setNome("Fabiana");
        p4.setGenero("feminino");
        p4.setIdade(36);

        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }

}
