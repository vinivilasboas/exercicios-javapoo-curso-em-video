package br.com;

import java.util.Random;

/**
 *
 * @author vinivilasboas
 */

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

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

    public void lutar() {
        if (this.isAprovada()) {
            int vencedor;
            int m1 = this.getDesafiante().getVitorias() - this.getDesafiante().getDerrotas();;
            int m2 = this.getDesafiado().getVitorias() - this.getDesafiado().getDerrotas();;
            int tot = m1 + m2;
            this.getDesafiante().apresentar();
            System.out.println("VERSUS");
            this.getDesafiado().apresentar();
            Random r = new Random();
            vencedor = r.nextInt(tot + 1);
            if (vencedor == 0) {
                System.out.println("EMPATOU!");
                this.getDesafiante().empatarLuta();
                this.getDesafiado().empatarLuta();
            } else if (vencedor <= m1) {
                System.out.println(this.getDesafiante().getNome() + " ganhou a luta!");
                this.getDesafiante().ganharLuta();
                this.getDesafiado().perderLuta();
            } else {
                System.out.println(this.getDesafiado().getNome() + " ganhou a luta!");
                this.getDesafiado().ganharLuta();
                this.getDesafiante().perderLuta();
            }
        } else {
            System.out.println("Luta não permitida!");
            System.out.println("");
        }
    }


}
