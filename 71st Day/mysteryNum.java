import java.util.Scanner;

public class mysteryNum {

    static int reverse(int x){
        String s = Integer.toString(x);
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        int rev = Integer.parseInt(s);
        return rev;
    }

    static boolean isMystery(int num)
    {
        for (int i=1;i<=num/2;i++){
            int j = reverse(i);
            if(i+j==num){
                System.out.println(i+" "+j);
                System.out.println(num + " is a mystery number");

                return true;

            }
        }
        System.out.println("THe given number is not a mystery number.");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        isMystery(num);
    }


    
}
