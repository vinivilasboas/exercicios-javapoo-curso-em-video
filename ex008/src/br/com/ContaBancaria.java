package br.com;

/**
 *
 * @author vinivilasboas
 */

public class ContaBancaria {

    public int num; //número da conta
    protected String tipo; // corrente ou poupança (cc ou cp)
    private String titular; //nome do titular
    private float saldo;
    private boolean estado; //aberta ou fechada (fechada, a princípio)

    public ContaBancaria(String titular, int num) {
        this.titular = titular;
        this.num = num;
        this.setEstado(false);
        this.setSaldo(0);
    }

    public int getNum() {
        return num;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void abrir(String t){
        this.setTipo(t);
        if (t == "CORRENTE") {
            this.setEstado(true);
            this.setSaldo(this.getSaldo() + 50); // ganha 50 ao abrir corrente
        } else if (t == "POUPANÇA") {
            this.setEstado(true);
            this.setSaldo(this.getSaldo() + 150); // ganha R$ 150 ao abrir poupanÃ§a
        } else {
            System.out.println("ERRO!");
            System.out.println("Tipo de conta nÃ£o especificado ou digitado com erro [favor repetir a digitação em letras maiúsculas!]");
            System.out.println("");
        }
    }

    public void fechar() {
        if (this.getSaldo() == 0) {
            this.setEstado(false);
        } else {
            System.out.println("ERRO!");
            System.out.println("Para fechar a conta o saldo deve estar zerado");
            System.out.println("Saldo atual: R$ " + this.getSaldo());
            System.out.println("");
        }
    } //saldo deve estar zerado

    public void depositar(float d) {
        if (this.isEstado() == true) {
            this.setSaldo(this.getSaldo() + d);
        } else {
            System.out.println("ERRO!");
            System.out.println("A conta deve estar aberta para receber movimentações");
            System.out.println("");
        }
    }

    public void sacar(float s) {
        if (this.isEstado() == true) {
            if (s > this.getSaldo()) {
                System.out.println("ERRO!");
                System.out.println("Saque maior que o permitido por ultrapassar o valor em conta");
                System.out.println("Saldo em conta: R$ " + this.getSaldo());
                System.out.println("");
            } else {
                setSaldo(getSaldo() - s);
            }
        } else {
            System.out.println("ERRO!");
            System.out.println("Conta está fechada");
            System.out.println("");
        }
    }

    public void pagar_mes() {
        int mes = 0;
        if (this.getTipo() == "CORRENTE"){
            mes = 12;
        } else if (this.getTipo() == "POUPANÇA") {
            mes = 20;
        }
        if (this.isEstado() == true) {
            this.setSaldo(this.getSaldo() - mes);
        } else {
            System.out.println("ERRO!");
            System.out.println("A conta está fechada");
            System.out.println("");
        }
    }

    public void status() {
        if (this.getTipo() == "CORRENTE") {
            System.out.println("");
            System.out.println("Conta Corrente");
            System.out.println("");
            System.out.println("TITULAR: " + this.getTitular());
            System.out.println("NÚMERO DA CONTA: " + this.getNum());
            if (this.isEstado() == true) {
                System.out.println("Status da conta: ABERTA");
            } else {
                System.out.println("Status da conta: FECHADA");
            }
            System.out.println("Saldo: R$ " + this.getSaldo());
            System.out.println("");
        } else if (this.getTipo() == "POUPANÇA") {
            System.out.println("");
            System.out.println("Conta Poupança");
            System.out.println("");
            System.out.println("TITULAR: " + this.getTitular());
            System.out.println("NÚMERO DA CONTA: " + this.getNum());
            if (this.isEstado() == true) {
                System.out.println("Status da conta: ABERTA");
            } else {
                System.out.println("Status da conta: FECHADA");
            }
            System.out.println("Saldo: R$ " + this.getSaldo());
            System.out.println("");
        } else {
            System.out.println("ERRO!");
            System.out.println("Tipo de conta nÃ£o especificado ou digitado com erro [favor repetir a digitação em letras maiúsculas!]");
            System.out.println("");
        }

    }


}
