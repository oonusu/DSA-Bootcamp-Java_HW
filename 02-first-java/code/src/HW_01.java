import java.util.Scanner;

// 1. Write a program to print whether a number is even or odd, also take input from the user.
public class HW_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
