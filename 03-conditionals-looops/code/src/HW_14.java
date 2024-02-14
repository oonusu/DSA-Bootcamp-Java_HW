import java.util.Scanner;

// 14. Volume Of Cone
public class HW_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        double r = s.nextDouble();
        System.out.print("Enter the height of cone: ");
        double h = s.nextDouble();

        double volume = 3.14285714286 * r * r * h / 3;
        System.out.println(volume);
        double volume2 = (float)22 / 7 * (r * r) * h / 3;
        System.out.println(volume2);
        double volume3 = (Math.PI * r * r * h) / 3;
        System.out.println(volume3);
    }
}
