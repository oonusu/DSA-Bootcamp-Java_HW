import java.util.Scanner;

// 5. Define a method that returns the product of two numbers entered by user.
public class HW_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Product of the two numbers: " + ProductOfTwoInt(a, b));
    }

    public static int ProductOfTwoInt(int a, int b){
        return a * b;
    }
}
