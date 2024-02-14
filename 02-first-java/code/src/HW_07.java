// 7. To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class HW_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int tmp = 0;

        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            tmp = b;
            b = a + b;
            a = tmp;
        }
    }
}
