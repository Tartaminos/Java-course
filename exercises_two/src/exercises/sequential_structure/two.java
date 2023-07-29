package exercises.sequential_structure;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        double radius, A;
        double pi = 3.14;

        Scanner scan = new Scanner(System.in);
        radius = scan.nextDouble();

        A =  pi * radius * radius;
        System.out.printf("A=%.4f%n", A);

        scan.close();

    }
}
