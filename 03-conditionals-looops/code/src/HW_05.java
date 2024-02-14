// 5. Area Of Parallelogram

public class HW_05 {
    public static void main(String[] args) {
        double length = 10.00;
        double breadth = 16.00;
        int angle = 60;
        double sin_x= Math.sin(Math.toRadians(angle));

        double area_parallelogram = length * breadth * sin_x;

        System.out.println(area_parallelogram);
    }
}
