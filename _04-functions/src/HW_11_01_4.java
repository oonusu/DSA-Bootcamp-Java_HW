import java.util.Scanner;

// 11_4. Take 2 numbers as inputs and find their HCF and LCM.
public class HW_11_01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("HCF: " + HCF(num1, num2));
        System.out.println("LCM: " + LCM(num1, num2));
    }

    public static int HCF(int num1, int num2){
        if (num2 == 0) {
            return num1;
        }
        return HCF(num2, num1 % num2);
    }

    public static int LCM(int num1, int num2) {
//        return num1 * num2 / HCF(num1, num2);

        int larger = (num1 > num2) ? num1 : num2;
        int i;
        for (i = larger; i <= num1 * num2; i = i + larger) {
            if (i % num1 == 0 && i % num2 == 0) {
                break;
            }
        }
        return i;
    }
}
