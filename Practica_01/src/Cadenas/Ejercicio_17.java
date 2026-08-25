package Cadenas;
import java.util.Scanner;


public class Ejercicio_17 {
    public static int cantidadApariciones(String s, char c){
        int cantidad=0;
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)==c){
                cantidad+=1;
            }
        }
        return cantidad;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 17");
        String frase;
        char letra;
        int resultado;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase= scan.nextLine();
        System.out.print("Ingrese una letra: ");
        letra= scan.next().charAt(0);
        resultado= cantidadApariciones(frase, letra);
        System.out.println("La cantidad de apariciones de "+letra+" en la frase es: "+resultado);
    }
}
