package Q3;

public class Sellers extends Funcionarios{
	
	int salarySellers;
	int totalSells;
	double commission;
	
	
	public Sellers(String name, String rg, int salarySellers) {
		super(name, rg);
		this.salarySellers = salarySellers;
	}

	public int getSalarySellers() {
		return salarySellers;
	}

	public void setSalarySellers(int salarySellers) {
		this.salarySellers = salarySellers;
	} 
	
	public  double paymentSellers (){
		return totalSells * commission + salarySellers;
	}

}
