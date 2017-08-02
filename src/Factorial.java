import java.util.Scanner;

/**
 * In mathematics, the factorial of a non-negative integer n, denoted by n!,
 * is the product of all positive integers less than or equal to n.
 *
 * For example, 5! = 5 x 4 x 3 x 2 x 1 = 120.
 */
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
