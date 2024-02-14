// 1.Area Of Circle Java Program

import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        System.out.print("radius = ");
        Scanner input = new Scanner(System.in);
        float radius = input.nextFloat();
        float pie = 3.142f;
        float AreaOfCircle = pie * radius * radius;

        System.out.println("Are of circle is : " + AreaOfCircle);
    }
}
