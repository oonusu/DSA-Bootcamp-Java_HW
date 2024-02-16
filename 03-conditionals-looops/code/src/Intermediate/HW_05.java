package Intermediate;

import java.util.Scanner;

// 5. Calculate Distance Between Two Points
public class HW_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("coordinates of the first point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("coordinates of the second point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double distance = Math.sqrt((x1 - x2) * (x1 -x2) + (y1 - y2) * (y1 - y2));
        System.out.println("Distance between the two points: " + distance);
    }
}
