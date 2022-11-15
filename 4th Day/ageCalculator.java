import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class ageCalculator {

    public static void main(String[] args) {
        // take input from user
        System.out.println("Enter your date of birth in YYYY-MM-DD format: ");

        Scanner scan = new Scanner(System.in);
        String dob = scan.nextLine();

        scan.close();

        LocalDate birthdate = LocalDate.parse(dob);
        // display age
        System.out.println("You are " + Calculate(birthdate) + " years old. ");

    }

    // function for calculating age
    public static int Calculate(LocalDate birthdate) {
        LocalDate today = LocalDate.now();
        if ((birthdate != null) && (today != null)) {
            // period.between gives age gap
            return Period.between(birthdate, today).getYears();
        } else {
            return 0;
        }

    }

}
