// 12. Perimeter Of Square

import java.util.Scanner;

public class HW_12 {
    public static void main(String[] args) {
        float s, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("The side length of the Square: ");
        s = sc.nextFloat();
        perimeter = 4 * s;
        System.out.println("\nPerimeter = "+perimeter);
    }
}
