import java.util.*;
public class strontio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = num;
        num =(num*2%1000)/10;
        if(num%10==num/10)
            System.out.println(n+" is a strontio number.");
        else
            System.out.println(n+" is not a strontio number.");
    }
    
}
