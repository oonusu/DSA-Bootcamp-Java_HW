package Intermediate;

import java.util.Scanner;

// 15. Find Ncr & Npr
// nCr = n!/r!(n-r)!
// nPr = n!/(n-r)!
public class HW_15 {
    public static void main(String[] args) {
        int n, r, npr, ncr, fact=1, numerator, denominator, i=1, sub;
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        n = sc.nextInt();
        System.out.print("r: ");
        r = sc.nextInt();

        while (i <= n ) {  // n!
            fact = fact * i;
            i++;
        }
        numerator = fact;
        sub = n - r;
        fact = 1;
        i = 1;
        while (i <= sub){  // (n-r)!
            fact *= i;
            i++;
        }
        denominator = fact;
        npr = numerator / denominator;
        System.out.println("nPr = " + npr);

        fact = 1;
        i =1;
        while(i <= r){  // r!
            fact *= i;
            i++;
        }
        denominator = fact * denominator;
        ncr = numerator / denominator;
        System.out.println("nCr = " + ncr);





    }
}
