import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regexJava {
    public static void main(String[] args) {
        Pattern required_pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
        Matcher required_match = required_pattern.matcher("Let's learn Java");
        boolean matchFound = required_match.find();
        if (matchFound) {
            System.out.println("Match Found !!");
        } else {
            System.out.println("Match not found !");
        }
    }

}
