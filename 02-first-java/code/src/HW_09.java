// 9.To find Armstrong Number between two given number.

import java.util.Scanner;

public class HW_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // 0
        int b = input.nextInt(); // 407
        int tmp = a; // 0
        a = Math.min(a, b); // 0
        b = Math.max(tmp, b); // 407
        System.out.println(a + " to " + b);

        int origin = a;
        while (origin <= b){
            for (int i = 1; i <= 9; i++) {
                int num = origin;
                int sum = 0;
                while(num > 0) {
                    int digit = num % 10;
                    int powered = digit;
                    for (int j = 1; j < i; j++) {
                        powered *= digit;
                    }
                    sum += powered;
                    num /= 10;
                }
                if (origin == sum){
                    System.out.print(sum + " ");
                    break;
                }
            }
            origin++;
        }
    }
}
