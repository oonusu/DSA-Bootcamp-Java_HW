import java.util.Scanner;

// 11_02_2. Take name as input and print a greeting message for that particular name.
public class HW_11_02_2 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greeting(name);
    }

    private static void greeting(String name) {
        System.out.printf("Hello %s~\n", name);
    }
}
