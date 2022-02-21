package br.com;

/**
 *
 * @author vinivilasboas
 */

public interface Publicacao {

    public void abrir(int pag);
    public void fechar();
    public void folhear(int f);
    public void avancarPagina();
    public void voltarPagina();

}
