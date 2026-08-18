package Metodos_con_resultados_e_iteracion;
import java.util.Scanner;

public class Ejercicio_14 {
    
    public static int cantCifras(int n){
        String numero= ""+n;      
        return numero.length();
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 14");
        Scanner scan= new Scanner(System.in);
        int numero,cifras;
        System.out.print("Ingrese un numero: ");
        numero= scan.nextInt();
        cifras= cantCifras(numero);
        System.out.println("La cantidad de cifras que tiene el numero "+numero+" es: "+cifras);        
    }
}
//String.valueOf(numero);
//Integer.toString(numero);