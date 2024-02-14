// 8. Perimeter Of Circle

public class HW_08 {
        static final double PI = Math.PI;

        static double Perimeter (double r)
        {
            return 2 * PI * r;
        }

    public static void main(String[] args) {

            double r = 5;

        System.out.println("Perimeter of the circle is : " + Perimeter(r));
    }
}
