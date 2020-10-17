package basicCoding;

public class PracticeExercises {

   /*
    * Find the smallest number among 3 numbers
    */
	void smallest(int a , int b, int c) {

		if ( a<b && a<c) {
			System.out.println("Smallest number is = "+a);

		}else if (b<a && b<c) {
			System.out.println("Smallest number is = "+b);

		}else {
			System.out.println("Smallest number is = "+c);
		}
	}
	
	/*
	 *  Find the Average of three numbers
	 */

	void Avgthreenumber(double a , double b , double c) {
		double d = (a+b+c)/3;
		System.out.println("Average is = "+d);
	}

	/*
	 * Find the middle character of the string
	 * if odd count then middle, if even count then 2 middle character
	 */
	
	void MiddleCharacter(String Str) {
		int len = Str.length();
		System.out.println("length is = "+len);
		if (len % 2 == 0) {
			char middle1 = Str.charAt((len/2)-1);
			char middle2 = Str.charAt(len/2);
			System.out.println("middle character of the string "+Str+ " are  = " + middle1 + " and " + middle2);
		}else {
			char middle = Str.charAt(len/2);
			System.out.println("middle character of the string "+Str+ " is = " + middle);
		}
	}

	/*
	 * Count the number of vowels in a string
	 */
	
	void countvowel(String Str) {
		int count = 0;
		int len = Str.length();
		for ( int i = 0 ; i<len ; i++) {
			char vowel = Str.charAt(i);
			if (vowel== 'a' || vowel == 'e' || vowel == 'i' || vowel=='o' || vowel=='u') {
				count = count + 1;
			}
		}
		System.out.println("Vowel count in String "+Str+ " is = "+count);
	}

	/*
	 * count the number of substrings in a string
	 */
	
	void countwordsinstring(String Str) {
		int count = 0;
		char ch[] = Str.toCharArray();
		int len = Str.length();
		for ( int i = 0 ; i<=len-1 ; i++) {
			if(Character.isSpaceChar(ch[i])) {
				count = count + 1;
			}
		}
		count = count + 1;
		System.out.println("Word count in the string is = "+count);
	}

	/*
	 * Calculate the sum of digits of a number
	 * 
	 */
	
	void Sumdigit(String num) {
		int sum = 0;
		int len = num.length();
		for( int i = 0; i<=len-1 ; i++) {
			int dig = Character.getNumericValue(num.charAt(i));
			sum = sum + dig;
		}
		System.out.println("Sum of digits of a number : "+ num + " is " + sum);
	}

	/*
	 * Check whether the Year is leap or not
	 */
	
	boolean checkyear(int year) {

		if (year % 100 == 0)
			return false;

		if(year % 400 == 0)
			return true;

		if(year % 4 == 0)
			return true;

		else {
			return false;
		}
	}

	/*
	 * Check the validity of the password
	 * Password must consists of only Digit or Alphabets
	 * Password must have 8 or more characters
	 */
	boolean CheckPassword(String Password) {
		int len = Password.length();
		System.out.println(len);
		char ch[] = Password.toCharArray();
		int count = 0;
		if (len>=8) {

			for(int i = 0 ; i<=len-1 ; i++) {

				if (Character.isSpaceChar(ch[i])) {
					System.out.println("Password contains space character");
					return false;
				}
				if (!(Character.isLetterOrDigit(ch[i]))) {
					System.out.println(ch[i]);
					System.out.println("Password has any character which is neither digit or alphabet");
					return false;
				}
				if (Character.isDigit(ch[i])) {
					count = count+1;
					System.out.println("digit count = " +count);
				}
			}
			if (count<2) {
				System.out.println("Digit count is less than 2 ");
				return false;
			}
			
		}else {
		System.out.println("Length is less than 8 characters");
		return false;
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		PracticeExercises obj = new PracticeExercises();
		obj.smallest(10, 20, 5);
		obj.Avgthreenumber(20.3, 100, 100);
		obj.MiddleCharacter("manju");
		obj.countvowel("aeiouuuuuuuuuuuuuuuuuuu");
		obj.countwordsinstring("Hello dear my name is Dikshant agarwal and I live in India. I am a software engineer by profession");
		obj.Sumdigit("5656566");
		System.out.println(obj.checkyear(2021)? "Leap Year" : "Not a Leap Year");
		System.out.println(obj.CheckPassword("abcdefgh0###1")? "Valid Password" : "Not a Valid Password");
	}

}
