import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>(size);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            array.add(element);
        }
        // Add up the elements of the array
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        System.out.println("The sum of the elements of the array is: " + sum);
        scanner.close();
    }
}
