import java.util.*;  
import java.io.*;  
public class xylemPhloem  
{  
    public static void main(String args[])  
    {  
        int num, extreme_sum = 0, mean_sum = 0, n;   
        Scanner sc= new Scanner (System.in);  
        System.out.print("Enter a number: ");  
        num = sc.nextInt();  
        num = Math.abs(num);  
        n = num;  

        while(n != 0)  
        {  
        //returns true if one of the conditions is true  
        if(n == num || n < 10)  
        //finds the last digit and add it to the variable extreme_sum  
        extreme_sum = extreme_sum + n % 10;  
        else  
        //finds the mean digits and add it to the variable mean_sum  
        mean_sum = mean_sum + n % 10;  
        //removes the last digit from the number  
        n = n / 10;  
        }  
        
        System.out.println("The sum of extreme digits: " + extreme_sum );  
        System.out.println("The sum of mean digits: " + mean_sum);  
        if(extreme_sum  == mean_sum)  
        System.out.println(num + " is a xylem number.");  
        else  
        System.out.println(num + " is a phloem number.");  
    }  
}  