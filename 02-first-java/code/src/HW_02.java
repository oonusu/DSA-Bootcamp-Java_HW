// 2. Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
