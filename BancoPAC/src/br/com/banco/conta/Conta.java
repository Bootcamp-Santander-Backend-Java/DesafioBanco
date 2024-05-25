package br.com.banco.conta;

public abstract class Conta implements ContaInterface {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1 ;


    protected int agencia;
    protected int numeroConta;
    protected float saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoEmComum(){
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("NUMERO DA CONTA: %d", this.numeroConta));
        System.out.println(String.format("SALDO: %.2f", this.saldo));
    }

}
