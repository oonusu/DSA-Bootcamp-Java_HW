import java.util.Scanner;
// 1. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class HW_01 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }

    public static int largest(int first, int second, int third) {
//        if (first > second) {
//            if (first > third ) return first;
//            else return third;
//        } else if (second > third) {
//            return second;
//        } else return third;

        int max = first;
        if (second > max) max = second;
        if (third > max) max = third;
        return max;
    }

    private static int smallest(int first, int second, int third) {
//        if (first < second) {
//            if (first < third) {
//                return first;
//            } else {
//                return third;
//            }
//        } else {
//            if (second < third) {
//                return second;
//            } else {
//                return third;
//            }
//        }

        int min = first;
        if (second < min) min = second;
        if (third < min) min = third;
        return min;
    }

}
