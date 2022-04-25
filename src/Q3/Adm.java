package Q3;

public class Adm extends Funcionarios {
	
	int salaryAdm;
	int extraHours;
	double bonusExtraHours = 0.01 * salaryAdm;

	public Adm(String name, String rg, int salaryAdm, int extraHours, double bonusExtraHours) {
		super(name, rg);
		this.salaryAdm = salaryAdm;
		this.extraHours = extraHours;
		this.bonusExtraHours = bonusExtraHours;
	}

	public int getSalaryAdm() {
		return salaryAdm;
	}

	public void setSalaryAdm(int salaryAdm) {
		this.salaryAdm = salaryAdm;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	public double getBonusExtraHours() {
		return bonusExtraHours;
	}

	public void setBonusExtraHours(int bonusExtraHours) {
		this.bonusExtraHours = bonusExtraHours;
	}
	
	public  double paymentAdm (){
		return (extraHours * bonusExtraHours ) + salaryAdm;
	}

}
