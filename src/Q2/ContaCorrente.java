package Q2;

public class ContaCorrente implements Conta{
	
	private double saldo;
	
	private double taxOperation = 0.45;
	
	@Override
	
	public void depositar (double valor) {
		this.saldo += valor - taxOperation;
	}
	
	@Override
	
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	
	public void sacar (double valor) {
		this.saldo -= valor + taxOperation;
	}
}
