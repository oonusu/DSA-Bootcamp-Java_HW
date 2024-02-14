// 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {
        System.out.print("Input two numbers: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double result = 0;

        System.out.print("Input an operator: ");
        char operator = input.next().trim().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            if (operator == '+') {
                result = a + b;
            }
            if (operator == '-') {
                result = a - b;
            }
            if (operator == '*') {
                result = a * b;
            }
            if (operator == '/') {
                result = a / b;
            }
            System.out.println("result: " + result);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
