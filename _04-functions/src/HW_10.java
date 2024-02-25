import java.util.Scanner;

// 10. Write a function to find if a number is a palindrome or not. Take number as parameter.
public class HW_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
    // 1221 121
    public static boolean isPalindrome(int num) {
        int pal = num;
        for (int i = num % 10; i <= num; i = (i * 10) + (pal % 10)) {
            if (i == num) {
                return true;
            }
            pal = pal / 10;
        }
        return false;
    }
}
