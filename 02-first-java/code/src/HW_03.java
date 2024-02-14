// 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.math.BigDecimal;
import java.util.Scanner;

public class HW_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input principal: ");
        int principal = input.nextInt();
        System.out.print("Input time: ");
        int time = input.nextInt();
        System.out.print("Input rate: ");
        float rate = input.nextFloat();

        float simpleInterest = principal * time * rate;
        BigDecimal bigDecimal = new BigDecimal(simpleInterest);
        System.out.println("Simple Interest : " + simpleInterest);
        System.out.println("Simple Interest : " + bigDecimal);
    }
}
