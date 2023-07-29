package exercises.condition_structure;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int horaInicial = scan.nextInt();
	    int horaFinal = scan.nextInt();
	    
	    int duracao;

	    		
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}

	    System.out.println("O JOGO DUROU " + duracao + "HORAS ");
	    
	scan.close();
	}

}
