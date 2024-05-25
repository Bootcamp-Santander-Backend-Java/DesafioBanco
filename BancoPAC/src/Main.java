import br.com.banco.conta.Conta;
import br.com.banco.conta.ContaCorrente;
import br.com.banco.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.depositar(100.50);
        cc.transferir(50.00, cp);


        cc.imprimirExtrato();
        cp.imprimirExtrato();



    }
}