package org.borjabolufer.prg3;

public class length {
    public static void main(String[] args) {
        String s = "Hola";

        int longitud = length(s);
        System.out.println("La longitud de " + s + " es " + longitud);
    }

    public static int length(String s) {
        boolean seguir = true;
        int contador = 0;
        while(seguir){
            try {
                s.charAt(contador);
                contador++;
            }catch (StringIndexOutOfBoundsException e){
                seguir = false;
            }
        }
        return contador;
    }

}
