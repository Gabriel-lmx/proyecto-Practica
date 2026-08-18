package Metodos_con_resultados_e_iteracion;
import java.util.Scanner;

public class Ejercicio_10 {
    
    public static int sumatoria(int n){
        int suma=0;
        for (int i = 1; i <= n; i++) {
            suma+=i;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 10");
        int numero,sumatoria;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ingrese el numero para la sumatoria: ");
        numero= scan.nextInt();                
        sumatoria= sumatoria(numero);
        System.out.println("La sumatoria de los numeros hasta el "+numero+" es: "+sumatoria);
    }
}
