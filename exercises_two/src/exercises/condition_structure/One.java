package exercises.condition_structure;
import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
	    
		if (number < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}

	scan.close();
	}
}
