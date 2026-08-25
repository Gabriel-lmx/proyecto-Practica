package Cadenas;
import java.util.Scanner;

public class Ejercicio_18 {
    public static int cantidadVocales(String s){
        int cantidad=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(esVocal(s.charAt(i))){
                cantidad++;
            }            
        }        
        return cantidad;
    }
    public static boolean esVocal(char letra){
        switch (letra) {
            case 'a':
                return true;  
            case 'e':
                return true;      
            case 'i':
                return true;  
            case 'o':
                return true;  
            case 'u':
                return true;       
            default:
                return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 18");
        String frase;
        int cantVocales;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese la frase: ");
        frase= scan.nextLine();
        cantVocales= cantidadVocales(frase);
        System.out.println("La cantidad de vocales en la frase es: "+cantVocales);
    }
}
