import java.util.Scanner;

// 23. Input a number and print all the factors of that number (use loops).
public class HW_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                System.out.print(i + " ");
                if (num / i != i) System.out.print(num / i + " ");
            }
        }
    }
}
