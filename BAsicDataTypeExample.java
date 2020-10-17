package basicCoding;

public class BAsicDataTypeExample {

	/*
	 *  8 bit memory location , default value = 0, min - -2^7 max - 2^7-1 , 
	 *  Byte data type is used to save space in large arrays, mainly in place of integers, 
	 *  since a byte is four times smaller than an integer
	 */
	
	byte by = 10; 
	
	/*
	 * 16 bit memory location , min => -2^15 max=> 2^15 -1 , default value is 0
	 * Short data type can also be used to save memory as byte data type. 
	 * A short is 2 times smaller than an integer
	 */
	
	short sh = 100;
	
	/*
	 * 32 bit , min => -2^31 max=> 2^31 -1 , default value is 0
	 */
	
	int a = 500;
	
	/*
	 * 64 bit ,This type is used when a wider range than int is needed
	 * Default value is 0L
	 */
	
	long ln = 2000L;

	/*
	 * 32 bit , Float is mainly used to save memory in large arrays of floating point numbers, Default value is 0.0f
	 * Float data type is never used for precise values such as currency
	 */
	float fl = 24f;

	/*
	 * double data type is a double-precision 64-bit IEEE 754 floating point
	 * This data type is generally used as the default data type for decimal values, generally the default choice
	 * Double data type should never be used for precise values such as currency
	 * Default value is 0.0d
	 * Example: double d1 = 123.4
	 */

	double db = 2000;
	/*
	 * boolean data type represents one bit of information
	 * There are only two possible values: true and false
	 * This data type is used for simple flags that track true/false conditions
	 * Default value is false
	 * Example: boolean one = true
	 */
	boolean one = true;

	/*
	 * char data type is a single 16-bit Unicode character
     * Minimum value is '\u0000' (or 0)
	 * Maximum value is '\uffff' (or 65,535 inclusive)
	 * Char data type is used to store any character
	 * Example: char letterA = 'A'
	 */
	
	char A = 'a';

}
