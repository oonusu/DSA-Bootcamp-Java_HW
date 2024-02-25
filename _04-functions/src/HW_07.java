// 7. Define a method to find out if a number is prime or not.
public class HW_07 {
    public static void main(String[] args) {
        int num = 121;
        isPrime(num);
        System.out.println(isPrime2(num));
    }

    public static void isPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not Prime.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not Prime.");
                return;
            }
        }
        System.out.println(num + " is Prime.");
    }

    public static boolean isPrime2(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(num); i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
