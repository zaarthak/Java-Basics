import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int inputNum = scanner.nextInt();

        // NOTE : use Math.log10 + 1 to calculate length of number
        int length = (int) (Math.log10(inputNum) + 1);

        int temp = inputNum;

        int remainder;

        int sum = 0;

        while (temp > 0) {

            remainder = temp % 10;
            sum = sum + (int) (Math.pow(remainder, length));
            temp  = temp / 10;
        }

        if (inputNum == sum) {

            System.out.printf("%d is a valid Armstrong number.", inputNum);
        } else {

            System.out.printf("%d is NOT a valid Armstrong number.", inputNum);
        }
    }
}
