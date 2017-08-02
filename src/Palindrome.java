import java.util.Scanner;

/**
 * A palindrome is defined as a word, phrase, or sequence that reads the same backwards as forwards.
 *
 * Example, madam, malayalam etc.
 */
public class Palindrome {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number : ");
        String inputValue = scanner.nextLine();

        int length = inputValue.length();

        boolean flag = true;

        for (int i = 0 ; i < length / 2 ; i++) {

            if (!inputValue.substring(i, i + 1).equals(inputValue.substring(length - i - 1, length - i))) {

                flag = false;
                break;
            }
        }

        if (flag) {

            System.out.printf("%s is a Palindrome.", inputValue);
        } else {

            System.out.printf("%s is NOT a Palindrome.", inputValue);
        }
    }
}
