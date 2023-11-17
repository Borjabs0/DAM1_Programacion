package org.borjabolufer.prg3;

public class Substring{
    public static void main(String []args) {
        String s = "Buenas tardes";
        int inicio = 7;
        int fin = 12;
        String resultado = sub(s, inicio, fin);
        System.out.println(resultado);
    }
        public static String sub(String s, int inicio , int fin){
        StringBuilder sb = new StringBuilder(fin - inicio + 1);
        for(int i = inicio; i < fin; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
        }

}
