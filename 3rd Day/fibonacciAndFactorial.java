
/**
 * fibonacciAndFactorial
 */
import java.util.Scanner;

public class fibonacciAndFactorial {
    static int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        int t1 = 0, t2 = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number upto which you want to print fibonacci");
        Integer number = s.nextInt();
        System.out.println("Fibonacci Upto " + number + "is : ");
        while (t1 <= number) {
            System.out.println(t1 + ", ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println("Enter the number for factorial");
        Integer num = s.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of " + num + " is :  " + factorial);

    }

}