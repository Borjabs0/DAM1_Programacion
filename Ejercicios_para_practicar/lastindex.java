package org.borjabolufer.prg3;

public class lastindex {
        public static void main (String[] args){
            System.out.println (lastIndexOf("Hola" ,"Ho"));

        }

        public static String sub(String s, int inicio , int fin){
            StringBuilder sb = new StringBuilder(fin - inicio + 1);
            for(int i = inicio; i < fin; i++){
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
        public static int lastIndexOf(String s1, String s2){
            for(int i = 0; i < s1.length() ; i--) {
                if (sub(s1, i, i + s2.length()).equals(s2))
                    return i;
            }
            return -1;

        }
        public static boolean equals(String s1,  String s2){
            if(s1.length() != s2.length()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.length() != s2.charAt(i)){
                        return false;
                    }
                }
            }
            return true;
        }
    }

