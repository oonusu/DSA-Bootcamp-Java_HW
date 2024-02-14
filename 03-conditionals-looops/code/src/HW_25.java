import java.util.Scanner;

// 25. Take integer inputs till the user enters 0 and print the largest number from all.
public class HW_25 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num;
        int largest = 0;
        do {
            num = sc.nextInt();
            largest = Math.max(num, largest);
        } while ( num != 0);
        System.out.println(largest);
    }
}
