import java.util.Scanner;

// 11. Convert the programs in flow of program, first java, conditionals & loops assignments into functions.
// - 1. Input a year and find whether it is a leap year or not.
public class HW_11_01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }


}
