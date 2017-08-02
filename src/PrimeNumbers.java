import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        boolean flag = false;

        if (inputNum > 1) {

            System.out.printf("Prime numbers less than %d are : \n", inputNum);
        } else {

            System.out.print("No prime numbers. Enter value greater than 1.");
        }

        for (int i = 2 ; i <= inputNum ; i++) {

            for (int j = 2 ; j <= i / 2 ; j++) {

                if (i % j == 0) {

                    flag = true;
                    break;
                }
            }

            if (!flag) {

                System.out.println(i);
            }

            flag = false;
        }
    }
}
