import java.util.Scanner;// 3. A person is eligible to vote if his/her age is greater than or equal to 18.
//  Define a method to find out if he/she is eligible to vote.
public class HW_03 {
    public static void main(String[] args) {
        System.out.print("Enter his/her age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("He/She is " + isEligibleToVote(age) + " to vote.");
    }

    public static String isEligibleToVote(int age) {
        if (age >= 18) {
            return "Eligible";
        }
        else {
            return "Not eligible";
        }
    }
}


