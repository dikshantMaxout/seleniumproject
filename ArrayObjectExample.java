package basicCoding;

public class ArrayObjectExample{
	
	int a;
	int b;
	
	void setdata(int c, int d) {
		a=c;
		b=d;
	}
		
	void showdata() {
		System.out.println("Value of a = " +a);
		System.out.println("Value of b = " +b);
	}
		
		
	public static void main(String args[]){
		ArrayObjectExample obj[] = new ArrayObjectExample[2];
		obj[0] = new ArrayObjectExample();
		obj[1] = new ArrayObjectExample();
		obj[0].setdata(10,40);
		obj[0].showdata();
		obj[1].setdata(20,40);
		obj[1].showdata();
	}
	
}

