// 2. Define a program to find out whether a given number is even or odd.
public class HW_02 {
    public static void main(String[] args) {

        // 1) Using Brute Force - Naive Approach
//        int num = 10;
//
//        if (num % 2 == 0) {
//            System.out.println("Entered number is Even");
//        }
//        else {
//            System.out.println("Entered number is Odd");
//        }

        // 2) Using bitwise operators
        //  A. Using Bitwise OR
//        int n = 100;
//
//        if ( (n | 1) > n) {
//            System.out.println("Entered number is Even");
//        }
//        else {
//            System.out.println("Entered number is Odd");
//        }

        //  B. Using Bitwise AND
//        int n = 0;
//
//        if ((n & 1) == 1) {
//            System.out.println("Number is Odd");
//        }
//        else {
//            System.out.println("Number is Even");
//        }

        //  C. Using Bitwise XOR
//        int n = -1;
//
//        if ((n ^ 1) == n + 1) {
//            System.out.println("number is Even " + (byte)(n^1));
//        }
//        else {
//            System.out.println("number is Odd " + (byte)(n^1));
//        }

        // 3) Checking the LSB(Least Significant Bit) of the number
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " : " + testOddEvenByCheckingLSB(i));
        }

    }

    public static String testOddEvenByCheckingLSB(int a) {
        if (a != 0) {
            if (Integer.toBinaryString(a).endsWith("0")) {
                return "Even";
            }
            else {
                return "Odd";
            }
        }
        else {
            return "Zero";
        }
    }
}
