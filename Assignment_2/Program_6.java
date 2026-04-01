import java.io.File;

public class Program_6
{
    public static void main(String[] args) {

        // Change this path to your folder
        File folder = new File("C:\\Users\\SIS\\Documents\\aayushijava\\src\\Assignment_1");

        // Check if folder exists
        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();

            System.out.println("Files in Directory:");

            for (File file : files) {

                // Check only files (not folders)
                if (file.isFile()) {

                    System.out.println(file.getName());
                }
            }

        } else {

            System.out.println("Directory not found or invalid path");
        }
    }
}