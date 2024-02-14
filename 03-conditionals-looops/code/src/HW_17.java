// 17. Volume Of Sphere
public class HW_17 {
    public static void main(String[] args) {
        double radius = 5.0;
        double pie = 3.14;
        double surface = 4 * pie * (radius * radius);
        double volume = pie * radius * radius * radius * 4 / 3;
        System.out.println("surface: " + surface);
        System.out.println("volume: "+ volume);
    }
}
