import java.util.*;

class getUserInputAndDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Question: ");
        String question = sc.nextLine();
        System.out.print("Answer: ");
        String ans = sc.nextLine();

        System.out.println("FAQs");
        System.out.println("Question : " + question);
        System.out.println("Answer :" + ans);
        // System.out.println("Do you want to add more?");

    }

}