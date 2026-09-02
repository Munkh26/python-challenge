//Name: Munkhsoyombo Munkhbat
//Date: 08/31/2026
//Description: It decipher the text in Python Challenge Level 1

public class level1 {
    public static void main(String[] args) {
        String message = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        String newMessage = "";
        for (int i = 0; i < message.length(); i++) {
            if (!message.substring(i, i+1).equals(" ")) {
                char letter = message.charAt(i);
                if (letter == 122) {
                    letter = 98;
                }
                else if (letter == 121) {
                    letter = 97;
                }
                else if (letter < 48 || letter > 122) {

                }
                else {
                    letter+=2;
                }
                newMessage += letter;
            }
            else {
                newMessage += " ";
            }
        }
        System.out.println(newMessage);
    }
}