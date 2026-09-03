import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        String key = "";
        File myObj = new File("level3.txt");
        Pattern pat = Pattern.compile("([A-Z]{3})[a-z]([A-Z]{3})"); // step 1 compile your pattern
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Matcher mat = pat.matcher(data); // step 2 set up your matcher
                while (mat.find()) {// step 3 look through until you find a match
                    System.out.println(mat.group()); // print the last match found
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
