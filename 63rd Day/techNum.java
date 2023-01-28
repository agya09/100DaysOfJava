import java.util.Scanner;
public class techNum{
    public static void main(String[] args) {
        int n, num, fHalf, sHalf, digits=0, squareOfSum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= sc.nextInt();
        num = n;
        while(num>0){
            digits++;
            num/=10;
        }
        if(digits % 2 ==0){
            num=n;
            fHalf = num % (int)Math.pow(10, digits/2);
            sHalf = num/ (int)Math.pow(10, digits/2);
            squareOfSum = (fHalf +sHalf) * (fHalf +sHalf);

            if(n == squareOfSum){
                System.out.println(n + " is a Tech Number");
            }
            else{
                System.out.println(n + " is not a Tech Number");
            }
        }
        else{
            System.out.println("Number of digits is odd");
        }
    }
}