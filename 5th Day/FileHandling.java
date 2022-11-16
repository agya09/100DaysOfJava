import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {
        try {
            File myobj = new File("filehandling.txt");
            if (myobj.createNewFile()) {
                System.out.println(myobj.getName() + " file is created.");
            } else {
                System.out.println(myobj.getName() + " file already exists");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}
