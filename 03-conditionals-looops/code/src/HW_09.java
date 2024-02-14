import java.util.Scanner;

// 9. Perimeter Of Equilateral Triangle
public class HW_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the side of the Triangle:");
        double a = s.nextDouble();
        double perimeter = 3 * a;

        System.out.println("Perimeter of Triangle is: "+ perimeter);
    }
}
