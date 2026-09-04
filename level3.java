import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        String key = "";
        File myObj = new File("level3.txt");
        Pattern pat = Pattern.compile("[^A-Z][A-Z][A-Z][A-Z][a-z][A-Z][A-Z][A-Z][^A-Z]"); // step 1 compile your pattern
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Matcher mat = pat.matcher(data); // step 2 set up your matcher
                while (mat.find()) {// step 3 look through until you find a match
                    key += mat.group().substring(4,5); // print the last match found
                }
            }
            System.out.println(key);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
