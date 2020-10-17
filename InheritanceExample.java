package basicCoding;


class Parent {

	void Car() {
		System.out.println("Duster");
	}

	void Bike() {
		System.out.println("Royal Enfield");
		
	}

}

class Child extends Parent {

	void Bike() {
		System.out.println("Ducati");

	}
}

public class InheritanceExample {

	public static void main(String args[]) {

		Parent eg  = new Child();
		eg.Bike();
		eg.Car();


	}}

