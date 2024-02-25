import java.util.Scanner;

// 6. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class HW_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();

        circumference(r);
        area(r);
    }

    public static void circumference(int r){
        System.out.printf("Circumference: %.2f\n", 2 * 3.14 * r);
    }

    public static void area(int r) {
        System.out.printf("Area: %.2f", 3.14 * r * r);
    }
}
