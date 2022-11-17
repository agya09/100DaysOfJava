import java.io.FileWriter;
import java.io.IOException;

class fileHandling {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("filehandling.txt");
            writer.write("This file is written using FileWriter in Java");
            writer.close();
            System.out.println("Successfully written in file");
        } catch (IOException e) {
            System.out.println("Aan error occurred");
            e.printStackTrace();
        }
    }
}