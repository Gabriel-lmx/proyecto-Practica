package Variables_expresiones_y_tipos;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1,num2,suma;
        System.out.print("Ingrese el primer numero: ");
        num1= scan.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2= scan.nextInt();
        suma= num1+num2;
        System.out.println("La suma es: "+suma);
    }
}
