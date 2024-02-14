// 2. Area Of Triangle

import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int height = input.nextInt(), Base = input.nextInt();
//        float Area = height * Base / 2f;
//        System.out.println(Area);

        float a = 5.0f;
        float b = 5.0f;
        float c = 6.0f;

        float S = (a + b + c) / 2;

        float A = (float)Math.sqrt(S * (S - a) * (S - b) * (S - c));

        System.out.println(A);
    }
}
