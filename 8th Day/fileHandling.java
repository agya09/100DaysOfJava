import java.io.File;

public class fileHandling {

    public static void main(String[] args) {
        // File dlt_file = new File("testfile.txt");
        // if (dlt_file.delete()) {
        // System.out.println(dlt_file.getName() + " is deleted.");
        // } else {
        // System.out.print("Failed to delete file");
        // }
        File dlt_folder = new File("C:\\Users\\DELL\\Desktop\\Java projects\\8th Day\\testfolder");
        if (dlt_folder.delete()) {
            System.out.println(dlt_folder.getName() + " is deleted. ");
        } else {
            System.out.println("Failed to delete folder");
        }

    }

}
