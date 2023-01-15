import java.util.*;

/**
 * pallindrome
 */
public class pallindrome {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or string to check if it is a pallindrome");
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);

        }
        if (original.equals(reverse)) {
            System.out.println("The given number is a pallindrome");

        } else {
            System.out.println("The given number is not a pallindrome");
        }
    }
}