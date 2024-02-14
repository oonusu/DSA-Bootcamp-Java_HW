import java.util.Scanner;

// 10. Perimeter Of Parallelogram

public class HW_10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the Parallelogram: ");
        double l = s.nextDouble();
        System.out.print("Enter the breadth fo the Parallelogram: ");
        double b = s.nextDouble();
        double perimeter = 2 * (l + b);
        System.out.println("Perimeter of Parallelogram: " + perimeter);

    }
}
