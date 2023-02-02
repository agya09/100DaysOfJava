import java.io.*;
import java.util.*;

public class emirpNum {
    public static boolean isPrime(int n){
        if(n <=1)
        return false;

        for(int i=2; i<n; i++)
            if(n %i ==0)
            return false;

        return true;
        
    }
    public static boolean isEmirp(int n){
        if(isPrime(n)== false)
        return false;

        int reverse =0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse *10+digit;
            n=n/10;
        }
        return isPrime(reverse);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int n = sc.nextInt();
        if(isEmirp(n)==true)
        System.out.println("The number is an emirp number");
        else
        System.out.println("The number is not an emirp number");
    }
    
}
