package exercises.condition_structure;

import java.util.Scanner;

public class two {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
	    
		if ((number % 2) == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}

	scan.close();
	}
}
