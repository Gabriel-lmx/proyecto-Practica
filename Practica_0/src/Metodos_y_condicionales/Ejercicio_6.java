//Recordar setear para que arranque desde el main del respectivo ejercicio.
package Metodos_y_condicionales;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void imprimirSuma(int a, int b){
        int suma= a+b;
        System.out.println("La suma es: "+suma);
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1,num2;
        System.out.print("Ingrese el primer numero: ");
        num1= scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= scan.nextInt();
        imprimirSuma(num1,num2);
    }
}
