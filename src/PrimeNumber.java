import java.util.Scanner;

public class PrimeNumber {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        boolean ifPrime = false;

        for (int i = 2 ; i <= inputNum / 2 ; i++) {

            if (inputNum % i == 0) {

                ifPrime = true;
                break;
            }
        }

        if (ifPrime) {

            System.out.printf("%d is NOT a prime number.", inputNum);
        } else {

            System.out.printf("%d is a prime number.", inputNum);
        }
    }
}
