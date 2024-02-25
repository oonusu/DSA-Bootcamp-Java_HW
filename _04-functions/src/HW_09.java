import java.util.Scanner;

// 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
//  Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
public class HW_09 {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial(n);
    }

    public static void Factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n ; i++) {
            fact = fact * i;
        }
        System.out.println(n + "! = " + fact);
    }
}
