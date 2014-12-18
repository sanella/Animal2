
public class Dog extends Animal {
	private String pasmina;

	public Dog(String ime, int numLegs){
		super(ime, numLegs, "dog");
		this.pasmina = "nepoznata";
	}
	
	public Dog(String ime, int numLegs, String pasmina){
		super(ime, numLegs, "dog");
		this.pasmina = pasmina;
	}
	
	public String oglasavanje(){
		return "av av";
	}
	
	public int testAnimal(){
		return this.getNumLegs();
			
		}
	@Override
	public String toString(){
		return "pas " +this.getIme();
	}

	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}
	
	
	
}
