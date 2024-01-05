package org.example.wcs.java._05;


public class Decipherer {
    private static String message1 = "0@sn9sirppa@#?ia'jgtvryko1";
    private static String message2 = "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj";
    private static String message3 = "aopi?sedohtém@#?sedhtmg+p9l!";

    public static void main(String[] args) {
        System.out.println(decryptMessage(message1));
        System.out.println(decryptMessage(message2));
        System.out.println(decryptMessage(message3));
    }

    private static String decryptMessage(String msg) {
        int keyNumber = msg.length() / 2;
        String subMsg = msg.substring(6, 6 + keyNumber - 1);
        String replace = subMsg.replaceAll("@#\\?"," ");

        return new StringBuilder(replace).reverse().toString();
    }
}
