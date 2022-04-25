package Q1;

import java.text.SimpleDateFormat;

import java.util.Date;



public class ContaPoupança extends Conta {
	
	public void imprimeExtrato() {
		
		System.out.println("### Extrato da Conta ###");
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/aaaa HH:mm:ss");
		
		Date date = new Date();
		
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Data: "+sdf.format(date));
	}

}
