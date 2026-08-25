package Variables_expresiones_y_tipos;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1,num2;
        System.out.print("Ingrese el primer numero: ");
        num1=scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= scan.nextInt();
        System.out.println("El promedio es: "+(num1+num2)/2);
    }
}
