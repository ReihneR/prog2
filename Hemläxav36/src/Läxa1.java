import java.util.ArrayList;
import java.util.Scanner;

public class Läxa1 {

	private static Scanner input;
	
	
	public static void main(String[] args) {
		
	
		
	ArrayList<Integer> heltal = new ArrayList<>();
		
		heltal.add(0);
		heltal.add(2);
		heltal.add(2);
		heltal.add(3);
		heltal.add(4);
		heltal.add(5);
		heltal.add(6);
		heltal.add(7);
		heltal.add(8);
		heltal.add(9);
		heltal.add(10);
		heltal.add(11);

		sum(heltal);
	
		
	

	}
	private static void sum(ArrayList<Integer> tal) {
		
		int sum = 0;
		
		for(int i = 0; i <tal.size(); i++) {
			
			sum = sum + tal.get(i);
			
		}
		
		System.out.println(sum);
	}
	

}
