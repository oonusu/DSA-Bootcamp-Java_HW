package Intermediate;

import java.util.Scanner;

// 3. Calculate Average Of N Numbers
public class HW_03 {
    public static void main(String[] args) {
        System.out.println("Total count of number to find the average of: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < count; i++) {
            sum += sc.nextInt();
        }
        double avg = (double) sum / count;
        System.out.println(avg);
    }
}
