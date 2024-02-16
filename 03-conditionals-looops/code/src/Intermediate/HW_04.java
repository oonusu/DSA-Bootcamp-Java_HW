package Intermediate;

import java.util.Scanner;

// 4. Calculate Discount Of Product
public class HW_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter List Price: ");
        int listPrice = sc.nextInt();
        System.out.print("Enter Discount Rate(%): ");
        int DiscountRate = sc.nextInt();

        double  DiscountPrice = listPrice * (100 - DiscountRate) / 100.0;
        System.out.println("Discount Price: " + DiscountPrice);
    }
}
