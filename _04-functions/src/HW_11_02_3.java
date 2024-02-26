import java.util.Scanner;

// 11_02_3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// Simple Interest = (P * T * R) / 100
public class HW_11_02_3 {
    public static void main(String[] args) {
        System.out.print("Enter principal, time, and rate: ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();

        simpleInterest(p, t, r);
    }

    private static void simpleInterest(int p, int t, int r) {
        double si = (p * t * r) / 100.0;
        System.out.println("Simple Interest: " + si);
    }
}
