import java.util.Scanner;

// 11_5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class HW_11_01_5 {

    static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("x")) {
            sum(input);
            input = sc.nextLine();
        }
        System.out.println(sum);
    }

    public static void sum(String input) {
        sum += Integer.parseInt(input);
    }
}
