import java.util.Scanner;

// 24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class HW_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = num;
        while (num != 0){
            num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
