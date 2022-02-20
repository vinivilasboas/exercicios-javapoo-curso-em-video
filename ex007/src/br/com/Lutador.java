package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String nac, int id, float alt, float pe, int vit, int der, int emp) {
        this.nome = no;
        this.nacionalidade = nac;
        this.idade = id;
        this.altura = alt;
        this.setPeso(pe);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nac) {
        this.nacionalidade = nac;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return peso;
    }

    // peso define categoria
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    // definição de categoria é privada porque depende da definição do peso
    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }

    // apresentação do lutador
    public void apresentar() {
        System.out.println("");
        System.out.println("LUTADOR: " + this.getNome());
        System.out.println("=====================================");
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("");
    }

    // mostra os aspectos técnicos do lutador
    public void status() {
        System.out.println("");
        System.out.println(this.getNome());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }




}
