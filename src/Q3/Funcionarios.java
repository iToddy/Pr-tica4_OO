package Q3;

public abstract class Funcionarios {
	
	String name;
	String rg;
	
	public Funcionarios(String name, String rg) {
		super();
		this.name = name;
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	

}
