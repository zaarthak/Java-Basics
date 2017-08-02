import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        long product = 1;

        for (int i = 1 ; i <= inputNum ; i++) {

            product = product * i;
        }

        System.out.printf("The factorial of %d is %d.", inputNum, product);
    }
}
