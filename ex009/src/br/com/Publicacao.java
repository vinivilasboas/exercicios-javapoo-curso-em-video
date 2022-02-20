package br.com;

/**
 *
 * @author vinivilasboas
 */

public interface Publicacao {

    public abstract void abrir(int pag);
    public abstract void fechar();
    public abstract void folhear(int f);
    public abstract void avancarPagina();
    public abstract void voltarPagina();

}
