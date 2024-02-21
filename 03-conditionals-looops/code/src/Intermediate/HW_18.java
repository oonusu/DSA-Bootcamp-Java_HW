package Intermediate;

import java.util.Scanner;

// 18. Future Investment Value
public class HW_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Present Value = ");
        int pv = sc.nextInt();
        System.out.print("Interest rate = ");
        double i = sc.nextDouble();
        System.out.print("the time period in years = ");
        int n = sc.nextInt();

        double FV = pv * Math.pow((1 + i/100), n);
        System.out.println("the Future Investment Value = " + FV);
    }
}
