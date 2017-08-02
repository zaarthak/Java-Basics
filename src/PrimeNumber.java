import java.util.Scanner;

/**
 * A prime number is a number that is divisible only by itself and 1.
 *
 * For example, 2, 5, 7, 19, 31 etc.
 */
public class PrimeNumber {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        boolean flag = false;

        for (int i = 2 ; i <= inputNum / 2 ; i++) {

            if (inputNum % i == 0) {

                flag = true;
                break;
            }
        }

        if (flag) {

            System.out.printf("%d is NOT a prime number.", inputNum);
        } else {

            System.out.printf("%d is a prime number.", inputNum);
        }
    }
}
