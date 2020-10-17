package basicCoding;

public class Student {

	String fname;
	String lname;
	int age;
	int wt;


	public void Infomessage() {

		System.out.println("Hello " +fname+ ","+lname+ " : My age is " +age+ " and weight is "+wt+ " thank you." );
	}

	public static void main(String[] args) {
		Student FrstStudent = new Student();
		FrstStudent.fname = "Julia";
		FrstStudent.lname = "Robert";
		FrstStudent.age = 29;
		FrstStudent.wt = 50;
		FrstStudent.Infomessage();
		
	}

}
