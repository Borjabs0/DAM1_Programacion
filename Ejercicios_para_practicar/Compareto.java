package org.borjabolufer.prg3;

public class Compareto{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        int resultado = compareTo(s1, s2);
        System.out.println("La suma es " + resultado);
    }

    public static int compareTo(String s1, String s2) {
        int suma1 = 0;
        int suma2 = 0;
        int i = 0;
        int max = Math.max(s1.length(), s2.length());
        while (i < max){
            if (i < s1.length())
                suma1 += (int)s1.charAt(i);
            if (i < s2.length())
                suma2 += (int)s1.charAt(i);
            i++;
        }
        return suma1 - suma2;
    }

}

