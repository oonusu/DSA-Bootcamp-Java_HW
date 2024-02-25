import java.util.Scanner;

// 4. Write a program to print the sum of two numbers entered by user by defining your own method.
public class HW_04 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SumOfTweInt(a, b);
    }

    public static void SumOfTweInt(int a, int b) {
        System.out.println("Sum of the two numbers: " + (a + b));
    }
}
