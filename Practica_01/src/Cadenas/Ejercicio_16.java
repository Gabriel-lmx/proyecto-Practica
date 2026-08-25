package Cadenas;
import java.util.Scanner;

public class Ejercicio_16 {
    public static String impimirReversa(String texto){
        String nuevotexto="";
        for(int i=texto.length()-1;i>=0;i--){
            nuevotexto+= texto.charAt(i);
        } 
        return nuevotexto;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String texto,nuevotexto;
        System.out.print("Ingrese el texto: ");
        texto= scan.nextLine();
        nuevotexto= impimirReversa(texto);       
        System.out.println("El texto invetido es\n"+nuevotexto);
    }
}
