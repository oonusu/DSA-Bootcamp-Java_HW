import java.util.Scanner;

// 15. Volume Of Prism
public class HW_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the area of base: ");
        double base = s.nextDouble();
        System.out.println("Enter the height: ");
        double height = s.nextDouble();

        double volume = base * height;
        System.out.println("Volume of the prism is: " + volume);
    }
}
