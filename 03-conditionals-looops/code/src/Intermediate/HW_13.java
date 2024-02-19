package Intermediate;

import java.util.Scanner;

// 13. Sum Of N Numbers
public class HW_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        sum = n * ( n + 1 ) / 2;
        System.out.println(sum);
    }
}
