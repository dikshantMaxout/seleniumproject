package basicCoding;

public class PractiseProblems {

	/*
	 * a) 101 + 0) / 3
	 * b) 3.0e-6 * 10000000.1
	 * c) true && true
	 * d) false && true
	 * e) (false && false) || (true && true)
	 * f) (false || false) && (true && true)
	 */

	void solve() {
		double val = ((101 + 0)/3);
		System.out.println(val);
		boolean a = true && true;
		System.out.println(a);
		boolean b = (false && true);
		System.out.println(b);
		boolean c = (false && false) || (true && true);
		System.out.println(c);
		boolean d = (false || false) && (true && true);
		System.out.println(d);

	}

	/*
	 * Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise
	 */

	void Equalornot(int a,int b,int c, int d) {

		if ( a==b && b==c && c==d) {
			System.out.println("Numbers are Equal ");
		}
		else {
			System.out.println("Numbers are not equal");
		}
	}

	/*
	 * Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.
	 */

	void DoubleCheck(double a , double b) {

		if (a>0 && b>0 && a>1 && b>1) {
			System.out.println("Numbers are : " + a + " and "+b+ "and lies exactly between 0 and 1" );

		}
		else {
			System.out.println("Numbers are : " + a + " and "+b+ "and both donot lie exactly between 0 and 1" );
		}
	}
	
	void Finalagecount(String fname, String lname , int initage) {
		int age = 10 + initage;
		System.out.println("Firstname is "+fname+ "Last name is "+lname+ " and age is  "+age);
	}
	

	public static void main(String[] args) {
		PractiseProblems soln = new PractiseProblems();
		soln.solve();
		soln.Equalornot(20,20,20,20);
		soln.DoubleCheck(0.9, 1);
		soln.Finalagecount("Dikshant", "Agarwal", 19);
	}

}
