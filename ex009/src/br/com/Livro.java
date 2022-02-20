package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor; // instanciado da classe Pessoa

    // construtor
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.setPaginaAtual(0);
        this.setAberto(false);
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir(int pag) {
        this.setAberto(true);
        this.setPaginaAtual(pag);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPaginaAtual(0);
    }

    @Override
    // página atual passa para a página folheada
    public void folhear(int f) {
        this.setPaginaAtual(f);
    }

    @Override
    public void avancarPagina() {
        // caso esteja antes do fim, pode avançar página. Caso contrário, fecha livro
        if (this.getPaginaAtual() < this.getTotalPaginas()) {
            this.setAberto(true);
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        } else {
            this.setAberto(false);
        }
    }

    @Override
    public void voltarPagina() {
        // caso esteja depois da capa, pode voltar página. Caso contrário, fecha livro
        if (this.getPaginaAtual() > 0) {
            this.setAberto(true);
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        } else {
            this.setAberto(false);
        }
    }
}
