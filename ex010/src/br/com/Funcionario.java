package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Funcionario extends Pessoa {

    private String setor;
    private boolean estaTrabalhando;

    public void mudarSetorDeTrabalho(String novoSetor) {
        this.setSetor(novoSetor);
        this.setEstaTrabalhando(true);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
        this.setEstaTrabalhando(true);
    }

    public boolean isEstaTrabalhando() {
        return estaTrabalhando;
    }

    public void setEstaTrabalhando(boolean estaTrabalhando) {
        this.estaTrabalhando = estaTrabalhando;
    }
}
