package basicCoding;

public class SingleDimArrayExample {
	
	int array[] = new int[5];
	//intarray[] = {1,2,3,4,5}; 
	
	
	void playingarray() {
		
		int len = array.length;
		for (int count = 0; count<len ; count++) {
			array[count] = count + 1;
		}
		for (int count = 0; count<len ; count++) {
			System.out.println("array["+count+"] = "+array[count]);
			
		}
		
	}
	
	public static void main(String args[]){
		SingleDimArrayExample Ex = new SingleDimArrayExample();
		Ex.playingarray();
	
	    
	}

}
