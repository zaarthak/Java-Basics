import java.util.Scanner;

/**
 * In mathematics, fibonacci series is a series of numbers in which each number ( Fibonacci number )
 * is the sum of the two preceding numbers.
 *
 * For example, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
 */
public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        int sum;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2 ; i < inputNum ; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            System.out.print(sum + " ");
        }
    }
}
