import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Stuff {
     public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=12345");
         BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
         String line = reader.readLine();
         System.out.println(line);

     }
}