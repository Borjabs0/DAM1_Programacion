package org.borjabolufer.prg3;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        String s = "s";
        String p = new String("s");
        System.out.println(s + " "+  p + " = " + "igual");*/
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.

    }
        public static boolean equals(String s1,  String s2){
            if(s1.length()!= s2.length()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.length() != s2.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
        }

}