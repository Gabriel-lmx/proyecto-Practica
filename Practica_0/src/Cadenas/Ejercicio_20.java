package Cadenas;
import java.util.Scanner;

public class Ejercicio_20 {
    
    public static boolean esCapicua(String s){
        String frase2="";
        for (int i = s.length()-1; i >= 0; i--) {
            frase2+= s.charAt(i);
            //System.out.println(s.charAt(i));
        }
        for (int i = 0; i < s.length()-1; i++) {            
            if(s.charAt(i)!=frase2.charAt(i)){
                return false;
            }                        
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 20");
        Scanner scan= new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase= scan.nextLine();
        System.out.println("La frase es capicua: "+esCapicua(frase));
    }
}
