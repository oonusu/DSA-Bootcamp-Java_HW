package Intermediate;
// 8. Calculate Depreciation of Value
public class HW_08 {
    public static void main(String[] args) {
        double V1, R, T, V2;
        V1 = 200;
        R = 10;
        T = 2;
        V2 = V1 * Math.pow(1 - (R / 100), T);
        System.out.println((float)V2);
    }
}
