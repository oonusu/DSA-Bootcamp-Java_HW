package Intermediate;

import java.util.Scanner;

// 20. LCM Of Two Numbers
public class HW_20 {
    public static void main(String[] args) {
        // mothod 1
//        int a = 12, b = 9, gcd = 1;
//
//        for (int i = 1; i <= a && i <= b; i++) {
//            if (a % i == 0 && b % i == 0){
//                gcd = i;
//            }
//        }
//        int lcm = a * b / gcd;
//        System.out.printf("The LCM of %d and %d is %d", a, b, lcm);

        // method 2
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i;
        int a = (x > y)? x : y;
        for (i = a; i <= x * y; i = i + a) {
            if (i % x == 0 && i % y == 0){
                break;
            }
        }
        System.out.printf("LCM of %d and %d is %d", x, y, i);
    }
}
