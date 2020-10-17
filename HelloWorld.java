package basicCoding;

public class HelloWorld {

	//Add two numbers
	void Addnumbers(int a,int b) {
		int c = a+b;
		System.out.println("Sum is "+c);
	}

	// Difference of two numbers
	void Difference(int a, int b) {
		int c = a-b;
		System.out.println("Difference is "+c);
	}

	//Multiplication of two numbers
	void multiply(int a , int b) {
		int c = a*b;
		System.out.println("Multiplication is "+c);
	}

	//Division of two numbers
	void Divide(double a , double b) {
		try {
			double c = a/b;
			System.out.println("Division is "+c);
		}
		catch (Exception e){
			System.out.println("Trying to divide by 0 which is not supported");

		}
	}

	//Solving an Algebraic equation
	void AlgrebricExp (int a,int b,int c) {
		int d = (a*(b+2*(a+b)))/2;
		System.out.println("Solution of the expression is "+d);
	}

	//Taking modulus of two numbers
	void Modof(int a , int b) {
		int c = a % b;
		System.out.println("Modulus is "+c);
	}

	//Printing a multiplication Table of any number
	public void MulTable(int a) {
		int i;
		for( i=1 ; i<=10 ; i++) {
			System.out.println("Multiplication table of "+a+ " is : " + a + " x " + i + " = " + (a*i));
		}
	}

	//Area of Triangle with user input radius of the circle.
	void AreaofCircle(int r) {
		double Area = 3.14 * r*r ;
		System.out.println("Are of the circle with radius " +r + " is "+ Area);
	}

	//Reversing an user input string.
	String ReverseString(String Str) {
		String Revstr= "";
		int len = Str.length();
		int i;
		for ( i=len-1 ; i>=0 ; i--) {
			Revstr = Revstr + Str.charAt(i);
		}
		return Revstr.toUpperCase();
	}

	//Count for number of letters,numbers,spaces and others characters in a string
	void Count(String inputStr) {
		char[] ch = inputStr.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i=0 ; i<inputStr.length() ; i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("The String is : "+inputStr);
		System.out.println("Letter count is  : "+letter);
		System.out.println("Number count is  : "+num);
		System.out.println("Space count is : "+space);
		System.out.println("Other count is : "+other);

	}


	public static void main(String[] args) {

		System.out.println("hello World");
		HelloWorld Math = new HelloWorld();
		Math.Addnumbers(2, 3);
		Math.Difference(5,2);
		Math.multiply(10, 1000);
		Math.Divide(0, 0);
		Math.AlgrebricExp(5, 6, 2);
		Math.Modof(10, 3);
		Math.MulTable(2);
		Math.AreaofCircle(5);
		System.out.println(Math.ReverseString("my name is dikshant"));
		Math.Count("My name        is 2321324324324???????.......... dikshant");
	}

}
