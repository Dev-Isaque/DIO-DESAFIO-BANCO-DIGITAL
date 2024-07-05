import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import conta.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Isaque Soares");
		cliente2.setNome("João Batista");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente2);

		cc.depositar(1000);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}