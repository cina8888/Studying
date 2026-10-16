import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutput {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            File fileStream = new File("resources/egg.txt");

            if (fileStream.getParentFile() != null && !fileStream.getParentFile().exists()) {
                fileStream.getParentFile().mkdirs();
            }
            if (!fileStream.exists()) {
                fileStream.createNewFile();
            }
            FileWriter eggFW = null;
            Double eggQuan;
            String guestName;
            System.out.print("Enter quantity of eggs (in pounds): ");  
            eggQuan = scan.nextDouble();
            System.out.print("Enter guest name: ");
            guestName = scan.next();

            eggFW = new FileWriter(fileStream);
            eggFW.write("To purchase: \n");
            eggFW.write("= = =\n");
            eggFW.write(eggQuan + " pounds of eggs for " + guestName + "\n");
            eggFW.write("= = =\n");
            scan.close();
            eggFW.close();
        } catch (IOException e) {
            System.out.println("Error with file!!!");
            e.printStackTrace();
        }
        
    }
}
