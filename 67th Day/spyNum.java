import java.util.Scanner;

public class spyNum {
    public static void main(String[] args) {
        int num, product = 1, sum =0, lastdig;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        num = sc.nextInt();

        while(num>0){
            lastdig  = num%10;
            sum   = sum+lastdig;
            product = product *lastdig;

            num = num/10;
        }
        if(sum==product)
            System.out.println("The number is a spy number");
        else
            System.out.println("The number is not a spy number");
    }
    
}
