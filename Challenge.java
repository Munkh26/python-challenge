public class Challenge {
    public static void main(String[] args) {
        String message = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
        String newMessage = "";
        for (int i = 0; i < message.length(); i++) {
            if (!message.substring(i, i+1).equals(" ")) {
                char letter = message.charAt(i);
                letter += 2;
                newMessage += letter;
            }
            else {
                newMessage += " ";
            }
        }
        System.out.println(newMessage);
    }
}