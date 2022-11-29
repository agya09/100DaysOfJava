import javax.sound.sampled.SourceDataLine;

public class compareString {

    public static void main(String[] args) {
        String str1 = "Hy world ";
        String str2 = "Hello world";
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Both string are same");
        } else {
            System.out.println("Both string are not same");
        }
    }

}
