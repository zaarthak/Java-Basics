import java.util.Scanner;

public class SubtringsOfAString {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any string : ");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        System.out.printf("All substrings in theS %s are : \n", inputString);

        for (int i = 0 ; i < length ; i++) {

            for (int j = i + 1 ; j <= length ; j++) {

                System.out.println(inputString.substring(i, j));
            }
        }
    }
}
