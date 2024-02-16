package Intermediate;
// 9. Calculate Batting Average
public class HW_09 {
    public static void main(String[] args) {
        int runs, matches, not_out;
        runs = 10000;
        matches = 250;
        not_out = 50;
        if (matches - not_out == 0){
            String battingAvg = "NA";
            System.out.println(battingAvg);
        }
        else {
            float battingAvg = (float) runs / (matches - not_out);
            System.out.println(battingAvg);
        }
    }
}
