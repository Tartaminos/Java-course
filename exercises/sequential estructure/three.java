import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int A, B, C, D, diferenca;

        Scanner scan = new Scanner(System.in);
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        scan.close();

    }
}
