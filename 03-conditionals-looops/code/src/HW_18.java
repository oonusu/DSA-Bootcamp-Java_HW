// 18.Volume Of Pyramid
public class HW_18 {

    public static float volumeTriangular(int a, int b, int h){
        float vol = (float) 1/6 * a * b * h;
        return vol;
    }


    public static float volumeSqure(int b, int h){
        float vol = (float)1 / 3 * b * b * h;
        return vol;
    }

    public static float volumePentagonal(int a, int b, int h){
        float vol = (float) 5/6 * a * b * h;
        return vol;
    }

    public static float volumeHexagonal(int a, int b, int h){
        float vol = (float) a * b * h;
        return vol;
    }

    public static void main(String[] args) {
        int b = 4, h = 9, a = 4;
        System.out.println("Volume of triangular base pyramid is " + volumeTriangular(a, b, h));
        System.out.println("Volume of square base pyramid is " + volumeSqure(b, h));
        System.out.println("Volume of pentagonal base pyramid is " + volumePentagonal(a, b, h));
        System.out.println("Volume of hexagonal base pyramid is " + volumeHexagonal(a, b, h));
    }
}
