package exercises.loop;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int senha = scan.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = scan.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		scan.close();
	}
}
