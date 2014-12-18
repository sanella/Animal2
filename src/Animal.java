public class Animal {

	private String ime;
	private int numLegs;
	private String type;

	public Animal(String ime, int numLegs, String type) {
		this.ime = ime;
		this.numLegs = numLegs;
		this.type = type;
	}

	public Animal(Animal other) {
		this.ime = other.ime;
		this.numLegs = other.numLegs;
		this.type = other.type;
	}

	public boolean equals(Animal other) {
		if (this.ime.equals(other.ime) && this.numLegs == other.numLegs
				&& this.type.equals(other.type)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String animal = "Animal [ime=" + ime + ", numLegs=" + numLegs + ", numLegs=" + type + "]";
		return animal;
	}

	private int testa(){
		return -1;
	}
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
