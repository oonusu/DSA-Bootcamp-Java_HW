// 13. Perimeter Of Rhombus

import java.util.Scanner;

public class HW_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Rhombus: ");
        double a = sc.nextDouble();
        double perimeter = 4 * a;
        System.out.println("Perimeter of Rhombus is: " + perimeter);
    }
}
