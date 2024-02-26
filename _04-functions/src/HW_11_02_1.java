import java.util.Scanner;

// 11_02_1. Write a program to print whether a number is even or odd, also take input from the user.
public class HW_11_02_1 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenOrOdd(n);
    }

    private static void evenOrOdd(int n) {
        if ((n | 1) == n + 1) {
            System.out.println(n + " is Even");
        }
        else {
            System.out.println(n + " is Odd");
        }
    }
}
