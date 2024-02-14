// 6. Input currency in rupees and output in USD.

import java.util.Scanner;

public class HW_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input rupees: ");
        int rupees = input.nextInt();
        float usd =  rupees * 0.012f;
        System.out.println("USD: " + usd);
    }
}
