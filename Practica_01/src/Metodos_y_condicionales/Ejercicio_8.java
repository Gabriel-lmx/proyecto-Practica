package Metodos_y_condicionales;
import java.util.Scanner;

public class Ejercicio_8 {
    
    public static void ponerNota(double x, double y){
        double promedio= (x+y)/2;
        if(promedio>=7){
            System.out.println("Promocionado");
        }else if(promedio>=4){
            System.out.println("Aprobado");
        }else{
            System.out.println("Debe Recuperar\n");    
        }
        System.out.println("El promedio es: "+ promedio);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        float num1,num2;
        System.out.println("Ejercicio 8");
        System.out.print("Ingrese la primer nota: ");
        num1= scan.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        num2= scan.nextFloat();
        ponerNota(num1,num2);
    }
    
}
