package basicCoding;

public class MethodExample {


	// No return type with no parameters
	void method1() {
		System.out.println("from method 1");
	}

	//no return type with parameters
	void method2(int a,int b) {
		int c = a+b;
		System.out.println("Sum is "+c);
	}
	// Return type with no parameters
	String method3(){
		return("Hello");
	}

	//Return type with parameters
	int method4(int a, int b){
		return(a+b);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample obj = new MethodExample();
		obj.method1();
		obj.method2(10, 30);
		System.out.println(obj.method3());
		System.out.println(obj.method4(4,5));
	}

}
