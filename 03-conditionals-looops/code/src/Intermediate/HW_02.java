package Intermediate;

import java.util.Scanner;

// 2. Calculate Electricity Bill
public class HW_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int total = 0;

        if (u > 300) {
            total += 25 * (u - 300);
            u = 300;
        }
        if ( u > 200) {
            total += 20 * (u - 200);
            u = 200;
        }
        if (u > 100) {
            total += 15 * (u - 100);
            u = 100;
        }
        total += 10 * u;
        System.out.println(total);
    }
}
