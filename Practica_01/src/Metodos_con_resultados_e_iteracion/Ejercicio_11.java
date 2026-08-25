package Metodos_con_resultados_e_iteracion;
import java.util.Scanner;

public class Ejercicio_11 {
    
    public static int sumatoriaPares(int n){
        int suma=0;
        for (int i = 2; i <= n; i+=2) {
            suma+=i;            
        }
        return suma;
    }
    public static void main(String[] args) {
         System.out.println("Ejercicio 11");
        int numero,sumatoria;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el numero para la sumatoria: ");
        numero= scan.nextInt();                
        sumatoria= sumatoriaPares(numero);
        System.out.println("La sumatoria de los numeros pares hasta el "+numero+" es: "+sumatoria);        
    }
}
