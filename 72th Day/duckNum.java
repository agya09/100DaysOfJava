import java.util.Scanner;

public class duckNum {
    public static boolean isDuck(int number){
        while(number != 0){
            if(number%10 ==0)
            return true;

            number = number/10;
        }
        return false;


    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = s.nextInt();

        if(isDuck(n))
        System.out.println(n + " is a duck number");
        else
        System.out.println(n + " is not a duck number");
    }
    
}
