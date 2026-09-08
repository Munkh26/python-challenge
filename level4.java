//Name: Munkhsoyombo Munkhbat
//Description: It reads the text on the website and uses regex to find the numbers and then it replaces the ending numbers of the original url and goes to another page and repeats until it finds the answer to level 4.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class level4 {
     public static void main(String[] args) throws IOException {
          boolean lineToRead = true;
          String nothing = "12345";
          while (lineToRead == true) {
               URL url = new URL("https://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=" + nothing);
               BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
               String line = reader.readLine();
               System.out.println(line);
               Pattern pat = Pattern.compile("and the next nothing is ([0-9]+)");
               Matcher mat = pat.matcher(line);

               if (line.contains("Yes. Divide")) {
                    int newNum = Integer.parseInt(nothing);
                    newNum /= 2;
                    nothing = "" + newNum;
                    System.out.println(nothing);

               } else {
                    nothing = "";
                    while (mat.find()) {
                         nothing = mat.group(1);
                    }
               }

               if (reader.readLine() == null && nothing.equals("")) {
                    lineToRead = false;
               }

          }

     }
}