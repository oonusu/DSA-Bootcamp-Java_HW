import java.util.Scanner;

// 21. Fibonacci Series In Java Programs
// There are many ways to write : https://www.geeksforgeeks.org/java-fibonacci-series/

public class HW_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, pre_b = 1;

        System.out.print(a + " ");
        while (n > 1) {
            System.out.print(b + " ");
            pre_b = b;
            b = a + b;
            a = pre_b;
            n--;
        }

    }
}
