
public class Läxa3 {

	public static void main(String[] args) {
		  Integer[] intArray = { 1, 2, 3, 4, 5, 6, };
		  
	      printArray(intArray); 
	}

	
	
	public static < E > E[] printArray( E[] inputArray ) {
	      
		for(E element : inputArray) {
	         System.out.println(" " + element);
	      }
		
		return inputArray;
	     
	   }
	
	
	
	
	
	
	
}
