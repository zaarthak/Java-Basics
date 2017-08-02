import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of radius : ");
        int radius = scanner.nextInt();

        System.out.println("The radius of the circle is : " + radius);

        // NOTE : use Math.PI constant to get the value of pi
        double area = Math.PI * radius * radius;
        System.out.println("The area of circle is : " + area);
    }
}
