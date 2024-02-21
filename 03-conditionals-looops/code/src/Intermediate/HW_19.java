package Intermediate;

import java.util.Scanner;

// 19. HCF(GCD) Of Two Numbers Program
public class HW_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp;
        if(a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
        int gcp = a - 1;

        while (gcp > 1){
            if (a % gcp == 0 && b % gcp == 0){
                break;
            }
            gcp--;
        }
        System.out.println("gcp = " + gcp);
    }
}
