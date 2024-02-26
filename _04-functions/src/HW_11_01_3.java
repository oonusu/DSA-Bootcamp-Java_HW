import java.util.Scanner;

// 11_3. Take a number as input and print the multiplication table for it.
public class HW_11_01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printMultiTable(n);
    }

    public  static void printMultiTable(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);

        }
    }
}
