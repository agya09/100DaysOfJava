import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to generate multiplication table:");
        num = sc.nextInt();
        System.out.printf("Multiplication table of %d is : \n", num);

        for (int i = 1; i <= 10; ++i) {
            System.out.printf(" %d * %d = %d \n", num, i, num * i);
        }
    }

}
