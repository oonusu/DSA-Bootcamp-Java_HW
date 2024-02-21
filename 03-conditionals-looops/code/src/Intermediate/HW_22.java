package Intermediate;
// 22. Check Leap Year Or Not
public class HW_22 {
    public static void main(String[] args) {
        int year = 1999;
        if (year % 400 == 0 ){
            System.out.println(year + " is a leap year");
        }else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
