import java.util.Scanner;

// 11_02_4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class HW_11_02_4 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter an operator: ");
        char op = sc.next().trim().charAt(0);

        System.out.println(x + Character.toString(op) + y + " = " + calc(x, op, y));
    }

    private static double calc(int x, char op, int y) {
        if (op == '+') {
            return x + y;
        }
        if (op == '-') {
            return x - y;
        }
        if (op == '*') {
            return x * y;
        }
        if (op == '/') {
            if (y != 0) {
                return (double) x / y;
            };
        }
        return 0;
    }
}
