package Metodos_con_resultados_e_iteracion;
import java.util.Scanner;        

public class Ejercicio_12 {
   public static double potencia(float x,int a){
        double potencia=1;
            for (int i = 1; i <= a; i++) {
                potencia*= x;            
            }
        return potencia;
    }
    public static void main(String[] args) {
        System.out.println("Ejercicio 12");
        int exponente;
        float numero;
        double potencia;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese el numero de la base: ");
        numero= scan.nextFloat(); 
        System.out.print("Ingrese el numero del exponente: ");
        exponente= scan.nextInt(); 
        potencia= potencia(numero, exponente);
        System.out.println("La potencia de "+numero+" elevado a "+exponente+" es: "+potencia);        
    } 
}
