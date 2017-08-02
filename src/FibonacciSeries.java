import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;

        int sum = 0;

        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2 ; i < inputNum ; i++) {

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

            System.out.print(sum + " ");
        }
    }
}
