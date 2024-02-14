import java.util.Scanner;

// 5.Take 2 numbers as input and print the largest number.
public class HW_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
//        System.out.println(Math.max(a, b));
        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
