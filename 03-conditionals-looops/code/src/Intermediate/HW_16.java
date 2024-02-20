package Intermediate;

import java.util.Scanner;

public class HW_16 {
    public static void main(String[] args) {
        String s = "Geeks", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks");

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            nstr = ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
