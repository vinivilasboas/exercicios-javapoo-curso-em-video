package br.com;

/**
 *
 * @author vinivilasboas
 */

public class Aula08 {

    public static void main(String[] args) {

        ContaBancaria c_1111 = new ContaBancaria("JUBILEU", 1111);
        c_1111.abrir("CORRENTE");
        c_1111.depositar(300);
        c_1111.sacar(350);
        c_1111.fechar();

        ContaBancaria c_2222 = new ContaBancaria("CREUZA", 2222);
        c_2222.abrir("POUPANÇA");
        c_2222.depositar(500);
        c_2222.sacar(100);


        c_1111.status();
        c_2222.status();

    }


}
