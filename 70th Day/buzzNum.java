import java.util.Scanner;

public class buzzNum {
    static boolean isBuzz(int n){
        if(n%10 == 7 || n%7 == 0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int n1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        n1 = s.nextInt();

        if(isBuzz(n1))
            System.out.println(n1+ " is a Buzz number");
        else
            System.out.println(n1+ " is not a Buzz number");
    }
    
}
