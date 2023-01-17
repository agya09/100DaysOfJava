import java.io.*;

public class pattern {
    // Function to demonstrate printing pattern
    public static void printStars(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 5;
        printStars(n);
    }
}
