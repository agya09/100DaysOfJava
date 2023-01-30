import java.util.*;

public class sunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        isSunny(N);
    }
    static boolean checkPerfectSq(double x) {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    static void isSunny(int N) {
        if (checkPerfectSq(N + 1)) {
            System.out.println(N + " is a sunny number.");
        } else {
            System.out.println(N + " is not a sunny number.");
        }
    }
}
