package br.com;

import java.util.Random;

/**
 *
 * @author vinivilasboas
 */

public class Luta {

    private Lutador desafiado; // atributo da classe Lutador
    private Lutador desafiante; // atributo da classe Lutador
    private int rounds;
    private boolean aprovada; // define se a luta pode ou não acontecer

    public Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    // depende de critérios definidos no método marcarLuta()
    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    // vencedor é definido por método randômico baseado em seu histórico de vitórias e derrotas
    public void lutar() {
        if (this.isAprovada()) {
            int vencedor;
            int empate;
            // vitórias - derrotas do desafiante
            int m1 = this.getDesafiante().getVitorias() - this.getDesafiante().getDerrotas();;
            // vitórias - derrotas do desafiado
            int m2 = this.getDesafiado().getVitorias() - this.getDesafiado().getDerrotas();;
            int tot = m1 + m2;
            this.getDesafiante().apresentar();
            System.out.println("VERSUS");
            this.getDesafiado().apresentar();
            Random p = new Random();
            empate = p.nextInt(9);
            // chance de empate definida em 10%
            if (empate == 0) {
                System.out.println("EMPATOU!");
                this.getDesafiante().empatarLuta();
                this.getDesafiado().empatarLuta();
            } else {
                Random r = new Random();
                vencedor = r.nextInt(tot);
                // chances dos lutadores distribuídas com base em seus respectivos históricos
                if (vencedor <= m1) {
                    System.out.println(this.getDesafiante().getNome() + " ganhou a luta!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                } else {
                    System.out.println(this.getDesafiado().getNome() + " ganhou a luta!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
            }

        } else {
            System.out.println("Luta não permitida!");
            System.out.println("");
        }
    }


}
