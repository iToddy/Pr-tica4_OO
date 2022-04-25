package Q3;

import java.util.Scanner;

public class MainFuncionarios {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Selecione uma das opções do Menu /ln 1- Funcionário Adm / ln 2- Funconário Vnedas /ln 3- Sair ");
		int option = entrada.nextInt();
		
		switch (option) {
		case 1:
			
			System.out.println("Qual seu nome");
			String nameAdm = entrada.next();
			
			System.out.println("Qual seu RG");
			String rgAdm = entrada.next();
			
			System.out.println("Insira o número de horas extrs trabalhadas");
			int extraHours = entrada.nextInt();
			
			int salaryAdm = 2000;
			double bonusExtraHours = 0.01 * salaryAdm;

			Adm Adm1 = new Adm(nameAdm, rgAdm, salaryAdm, extraHours, bonusExtraHours);
			
			Adm1.paymentAdm();
			
			break;
		
		case 2: 
			
			System.out.println("Qual seu nome");
			String nameSellers = entrada.next();
			
			System.out.println("Qual seu RG");
			String rgSellers = entrada.next();
			
			System.out.println("Insira o total de vendas");
			int totalSells = entrada.nextInt();
			
			int salarySellers = 1500;
			double commission = 0.05;
			
			Sellers S1 = new Sellers(nameSellers, rgSellers, salarySellers);
			
			S1.paymentSellers();
			
			break;
			
		case 3:
			
			System.out.println("Menu finalizado");
			
			break;
			
		default: 
			
			System.out.println("ERRO");
	
		}
	}
		
		
}


