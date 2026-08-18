package Metodos_y_condicionales;
import java.util.Scanner;

public class Ejercicio_9 {
    
    public static void imprimirFecha(int dia,int mes, int anio){
        System.out.print(dia);
        switch (mes) {
            case 1:
                 System.out.print(" Enero ");
                break;
            case 2:
                 System.out.print(" Febrero ");
                break;
            case 3:
                 System.out.print(" Marzo ");
                break;
            case 4:
                 System.out.print(" Abril ");
                break;
            case 5:
                 System.out.print(" Mayo ");
                break;
            case 6:
                 System.out.print(" Junio ");
                break;
            case 7:
                 System.out.print(" Julio ");
                break;     
            case 8:
                 System.out.print(" Agosto ");
                break;          
            case 9:
                 System.out.print(" Septiembre ");
                break;         
            case 10:
                 System.out.print(" Octubre ");
                break;             
            case 11:
                 System.out.print(" Noviembre ");
                break;             
            case 12:
                 System.out.print(" Diciembre ");
                break;             
            default:
                throw new AssertionError();
        }
        System.out.println("de "+anio);
    }
    public static void main(String[] args) {
        int dia,mes,anio;
        Scanner scan= new Scanner(System.in);
        System.out.println("Ejercicio 9");
        System.out.println("Ingrese el dia: ");
        dia= scan.nextInt();
        System.out.println("Ingrese el mes: ");
        mes= scan.nextInt();
        System.out.println("Ingrese el anio: ");
        anio= scan.nextInt();
        imprimirFecha(dia,mes,anio);
    }
}
