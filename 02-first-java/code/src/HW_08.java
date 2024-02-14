// 8. To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class HW_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int i = 0;
        int j = string.length() - 1;

        while(i < j) {
            if(string.trim().charAt(i) == ' '){
                i += 1;
                continue;
            }
            if(string.trim().charAt(j) == ' '){
                j -= 1;
                continue;
            }
            if (string.trim().charAt(i) != string.trim().charAt(j)) {
                System.out.println("It's not Palindrome.");
                break;
            }
            i += 1;
            j -= 1;
        }
        if (i >= j) {
            System.out.println("It's Palindrome.");
        }
    }
}
