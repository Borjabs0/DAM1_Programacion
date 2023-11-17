package org.borjabolufer.prg3;

import java.awt.desktop.SystemEventListener;

public class cocat {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Pepe";
        String concatenador = Concat(s1, s2);
        System.out.print(concatenador);
    }

    public static String Concat(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1.length() + s2.length());
        sb.append(s1).append(s2);
        return sb.toString();
    }
}
