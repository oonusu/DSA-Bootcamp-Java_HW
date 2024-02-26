import java.util.Scanner;

// 11_2. Take two numbers and print the sum of both.
public class HW_11_01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        printSum(num1, num2);
    }

    public static void printSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
