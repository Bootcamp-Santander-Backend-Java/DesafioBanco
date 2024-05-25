package br.com.banco.conta;

public class ContaPoupanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA POUPAÇA");
        super.imprimirInfoEmComum();

    }

}
