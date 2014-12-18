
public class AnimalTest {
public static void main(String[] args) {
	
	
	Animal dog = new Animal("Rex", 4, "dog");
	Animal cat = new Animal("Molly", 4, "dog");
	
	System.out.println(dog.toString());
	System.out.println(cat.toString());
	
	
	System.out.println("ispis Dog klase kcerke Animal klase");
	Dog neki = new Dog("Bob", 4);
	System.out.println(neki.toString()); // koristi string ANimal dok ne napravim novi string uklasi Dog
	
	Animal dog3 = new Dog("Lesi" , 4); // objekt tipa animal koj je objekt tipa dog, obrnuto ne moze
	System.out.println(dog3.toString());
	
	Animal a = new Animal("Sapi", 4, "dog");
	Animal dog4 = (Animal)dog3;
	
	System.out.println(dog4 instanceof Animal);
	System.out.println(a instanceof Dog);
	System.out.println(neki instanceof Dog);
}
}
