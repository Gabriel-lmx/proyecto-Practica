//Recordar setear para que arranque desde el main del respectivo ejercicio.
package Metodos_y_condicionales;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void imprimirPromedio(int a, int b){
        float promedio= (a+b)/2;
        System.out.println("El promedio es: "+ promedio);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1,num2;
        System.out.println("Ejercicio 7");
        System.out.print("Ingrese el primer numero: ");
        num1= scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= scan.nextInt();
        imprimirPromedio(num1,num2);
    }
}
