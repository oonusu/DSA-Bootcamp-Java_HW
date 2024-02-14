import java.util.Scanner;

// 26. Addition Of Two Numbers
public class HW_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Addition Of Two Numbers : " + sum);
    }
}
