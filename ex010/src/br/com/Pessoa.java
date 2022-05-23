package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Pessoa {

    private String nome, genero;
    private int idade;

    public void fazerAniversario (){
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
