package Intermediate;

import java.util.Scanner;

// 26.  Write a program to print the sum of negative numbers,
//      sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//      The list terminates when the user enters a zero.
public class HW_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, neg=0, posEven=0, posOdd=0;
        do {
            num = sc.nextInt();
            if (num < 0) neg = neg + num;
            if (num > 0) {
                if (num % 2 == 1) posOdd = posOdd + num;
                if (num % 2 == 0) posEven = posEven + num;
            }
        } while (num != 0);
        System.out.println("sum of negative numbers: " + neg);
        System.out.println("sum of positive even numbers: " + posEven);
        System.out.println("sum of positive odd numbers: " + posOdd);
    }

}
