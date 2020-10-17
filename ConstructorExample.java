package basicCoding;


//with Parameter
public class ConstructorExample {

	int a;

	ConstructorExample(int x){

		a=x;

	}

	public static void main(String[] args) {

		ConstructorExample t1 = new ConstructorExample(10);
		System.out.println(t1.a);



	}
}