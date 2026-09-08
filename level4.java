import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class level4 {
     public static void main(String[] args) throws IOException {
          String nothing = "12345";
          while (nothing != null) {
               URL url = new URL("https://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + nothing);
               BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
               String line = reader.readLine();
               System.out.println(line);
               Pattern pat = Pattern.compile("and the next nothing is ([0-9]+)");
               Matcher mat = pat.matcher(line);

               if (line.contains("Yes")) {
                    int newNum = Integer.parseInt(nothing);
                    newNum /= 2;
                    nothing = "" + newNum;
                    System.out.println(nothing);

               } else {
                    nothing = "";
                    while (mat.find()) {
                         nothing += mat.group(1);
                    }
                    
               }

          }

     }
}