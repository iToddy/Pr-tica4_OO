package Q2;

public class MainQ2 {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.depositar(1200.50);
		cc.sacar(300);
		
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.depositar(500.50);
		cc.sacar(25);
		
		
		GeradordeExtratos gerador = new GeradordeExtratos();
		
		gerador.geradordeConta(cc);
		gerador.geradordeConta(cp);
	}

}
