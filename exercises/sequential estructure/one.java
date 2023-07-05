import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int value_1, value_2;

        Scanner scan = new Scanner(System.in);

        value_1 = scan.nextInt();
        value_2 = scan.nextInt();
        System.out.println("SOMA = " + (value_1 + value_2));

        scan.close();

    }
}